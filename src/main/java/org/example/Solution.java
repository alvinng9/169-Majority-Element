package org.example;

import java.util.Arrays;

public class Solution {
    public int majorityElement(int[] nums) {
        //sort the array from least to most
        Arrays.sort(nums);
        //return the value of the index in the middle
        //since the majority element will appear more than half of the indexes
        //it is guarantee that the majority element will be in the middle
        return nums[nums.length/2];
    }
}
