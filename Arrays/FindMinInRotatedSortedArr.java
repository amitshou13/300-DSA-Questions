public class FindMinInRotatedSortedArr {
    public static int findMin(int[] nums) {
        int i=0;
        int j=nums.length-1;
        while(i<j){
            int mid=(i+j)/2;
            if(nums[mid]<nums[j]){
                j=mid;
            }
            else{
                i=mid+1;
            }
        }
        return nums[i];
    }
    public static void main(String[] args) {
        int arr[]={3,4,5,1,2};
        System.out.println(findMin(arr));
    }
}
