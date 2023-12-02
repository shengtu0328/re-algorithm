package com.xrq.algorithm.String;

import java.util.HashMap;

/**
 * https://leetcode.cn/problems/longest-substring-without-repeating-characters/
 */
public class LeetCode3 {
    public int lengthOfLongestSubstring(String s) {

        int maxLength = 0;

        int start = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            // 重复
            if (map.containsKey(key)) {
                start = Math.max(map.get(key) + 1, start);
                map.put(key, i);
            }
            //没有重复
            else {
                map.put(key, i);
            }
            maxLength = Math.max(maxLength, i - start + 1);

        }
        return maxLength;

    }

}
