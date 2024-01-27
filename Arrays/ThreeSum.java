//Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
//Notice that the solution set must not contain duplicate triplets.

import java.util.*;
public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> al=new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i-1]==nums[i]){
                continue;
            }
            int j=i+1;
            int k=nums.length-1;
            int sum=0;
            while(j<k){
                sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    al.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k])));
                    while(j<k && nums[j]==nums[j+1]){
                        j++;
                    }
                    while(k>j && nums[k]==nums[k-1]){
                        k--;
                    }
                    j++;
                    k--;
                }
                else if(sum<0){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return al;
    }
    public static void main(String[] args){
        int arr[]={-1,0,1,2,-1,-4};
        List<List<Integer>> al=threeSum(arr);
        System.out.println(al);
    }
}