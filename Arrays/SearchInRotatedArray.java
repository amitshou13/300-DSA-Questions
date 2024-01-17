//Search in rotated array 
public class SearchInRotatedArray {
    public static int search(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            if(nums[i]==target){
                return i;
            }
            if(nums[j]==target){
                return j;
            }
            i++;
            j--;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2,3};
        System.out.println(search(arr, 0));
    }
}