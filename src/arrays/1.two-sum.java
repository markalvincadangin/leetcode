package arrays;
/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

import java.util.HashMap;
import java.util.Map;

// ─── Problem ──────────────────────────────────────────────
// Name       : Two Sum
// Link       : https://leetcode.com/problems/two-sum/
// Topic      : Arrays & Hashing
// Difficulty : Easy
// ──────────────────────────────────────────────────────────

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];

            if (numsToIndex.containsKey(need)){
                return new int[] { numsToIndex.get(need), i };
            }
            
            numsToIndex.put(nums[i], i);
        }
        return new int[0];
    }
}
// @lc code=end
