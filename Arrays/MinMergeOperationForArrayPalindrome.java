//Minimum Number of Merge Operations to Make a Array Palindrome

public class MinMergeOperationForArrayPalindrome{
    public static int MinMergeOperation(int arr[]){
        int count=0;
        int i=0;
        int j=arr.length-1;
        int left=arr[i];
        int right=arr[j];
        while(i<j){
            if(left==right){
                left=arr[++i];
                right=arr[--j];
            }
            else if(left>right){
                right+=arr[--j];
                count++;
            }
            else{
                left+=arr[++i];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={4,3,2,1,2,3,1};
        System.out.println(MinMergeOperation(arr));
    }
}
