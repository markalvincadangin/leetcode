package arrays;
/*
 * @lc app=leetcode id=49 lang=java
 *
 * [49] Group Anagrams
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// ─── Problem ──────────────────────────────────────────────
// Name       : Group Anagrams
// Link       : https://leetcode.com/problems/group-anagrams/
// Topic      : Arrays & Hashing
// Difficulty : Medium
// ──────────────────────────────────────────────────────────

// @lc code=start
class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> group = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] strArray = strs[i].toCharArray();
            Arrays.sort(strArray);

            if (!group.containsKey(String.valueOf(strArray))){
                group.put(String.valueOf(strArray), new ArrayList<>());
            }
            group.get(String.valueOf(strArray)).add(strs[i]);
        }
        return new ArrayList<>(group.values());
    }
}
// @lc code=end

