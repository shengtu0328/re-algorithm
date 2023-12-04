package com.xrq.algorithm.hash;

import java.util.HashMap;

/**
 * https://leetcode.cn/problems/longest-substring-without-repeating-characters/
 */
public class LeetCode3 {
    public static int lengthOfLongestSubstring(String s) {

        int maxLength = 0;

        int start = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            // 重复
            if (map.containsKey(key)) {
                //如果有 “abba” 这种情况下，最后一个a，虽然之前已经出现，但是已不在当前判断流程中的字符串子串中，所以start=start值
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

    public static void main(String[] args) {
        String s="abba";

        System.out.println(lengthOfLongestSubstring(s));
    }

}
