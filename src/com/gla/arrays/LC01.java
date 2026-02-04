package com.gla.arrays;

public class LC01 {
    public int[] twoSum(int[] nums, int target) {
        int[] result = null;
        int[] ans=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                    ans[0]=i;
                    ans[1]=j;
                    result = ans;
                    break;
                }

            }
            if (result != null) break;
        }
        if (result == null) {
            result = ans;
        }
        return result;
    }
}

