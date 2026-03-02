class Solution {
    public int lengthOfLongestSubstring(String s) {

        int max = 0;

        for (int i = 0; i < s.length(); i++) {

            int count = 0;

            for (int j = i ; j < s.length(); j++) {

                boolean duplicate = false;

                // Check if s[j] appeared before between i and j-1
                for (int k = i; k < j; k++) {
                    if (s.charAt(k) == s.charAt(j)) {
                        duplicate = true;
                        break;
                    }
                }

                if (duplicate) {
                    break;
                }

                count++;
            }

            if (count > max) {
                max = count;
            }
        }

        return max;
    }
}