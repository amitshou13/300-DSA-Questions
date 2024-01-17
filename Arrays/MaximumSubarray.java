//Maximum subarray sum 
public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            max=(sum>max) ? sum:max;
            if(sum<0){
                sum=0;
            } 
        }
        return max;
    }
    public static void main(String[] args){
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }
}
