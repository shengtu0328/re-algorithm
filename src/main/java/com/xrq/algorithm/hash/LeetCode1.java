package com.xrq.algorithm.hash;

import java.util.HashMap;

/**
 * https://leetcode.cn/problems/two-sum/
 */
public class LeetCode1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer> ();
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            int y = target - x;
            if(map.get(y)==null){
                map.put(nums[i],i);
            }else {
                return  new int[]{map.get(y),i};
            }
        }
        return null;
    }


    public static void main(String[] args) {

    }
}