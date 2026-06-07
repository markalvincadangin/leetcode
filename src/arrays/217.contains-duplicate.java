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

