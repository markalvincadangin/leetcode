package arrays;
/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

import java.util.Arrays;

// ─── Problem ──────────────────────────────────────────────
// Name       : Valid Anagram
// Link       : https://leetcode.com/problems/valid-anagram/
// Topic      : Arrays & Hashing
// Difficulty : Easy
// ──────────────────────────────────────────────────────────

// @lc code=start
class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println("Test Case 1: " + sol.isAnagram("anagram", "nagaram")); // true
        System.out.println("Test Case 2: " + sol.isAnagram("rat", "car")); // false
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);
        
        return Arrays.equals(sArr, tArr);
    }
}
// @lc code=end
