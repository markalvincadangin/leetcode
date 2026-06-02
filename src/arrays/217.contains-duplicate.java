package arrays;
/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 */

import java.util.*;

// ─── Problem ──────────────────────────────────────────────
// Name       : Contains Duplicate
// Link       : https://leetcode.com/problems/contains-duplicate/
// Topic      : Arrays & Hashing
// Difficulty : Easy
// ──────────────────────────────────────────────────────────

// @lc code=start
class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println("Test Case 1: " + sol.containsDuplicate(new int[]{1,2,3,1})); // true
        System.out.println("Test Case 2: " + sol.containsDuplicate(new int[]{1,2,3,4})); // false
    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numbers = new HashSet<>();

        for (int num : nums) {
            if (!numbers.add(num)){
                return true;
            }
        }
        return false;
    }
}
// @lc code=end

