package Arrays;

public class longestSubString {
    /************************************* */
    // time complexity: O(n^3)
    // public int lengthOfLongestSubstring(String s) {
    //     int n = s.length();
    //     int currMax = 0;

    //     for (int i = 0; i < n; ++i) {
    //         for (int j = i; j < n; ++j) {
    //             if (isUnique(s, i, j)) {
    //                 currMax = Math.max(currMax, j - i + 1);
    //             }
    //         }
    //     }

    //     return currMax;

    // }

    // public boolean isUnique(String s, int start, int end) {
    //     int[] chars = new int[128];

    //     for (int i = start; i <= end; ++i) {
    //         char letter = s.charAt(i);
    //         chars[letter] += 1;
    //         if (chars[letter] > 1)
    //             return false;
    //     }
    //     return true;
    //************************************** */ }

    //optimal soln
    //time complexity: O(2n)-> O(n)
    //space complexity: O(min(m,n))
    public int lengthOfLongestSubstring(String s) {
        int[] chars = new int[128];//hash map, ascii has 128 
        int n = s.length();
        int currMax = 0, left = 0, right = 0;

        while (right < n) {
            char r = s.charAt(right);
            chars[r]++;
            //shrink window from left until no repeating chars 
            while (chars[r] > 1) {
                char l = s.charAt(left);
                chars[l]--;
                left++;
            }
            //update size of window if greater else same
            currMax = Math.max(currMax, right - left + 1);
            right++;
        }
        return currMax;
    }
}
