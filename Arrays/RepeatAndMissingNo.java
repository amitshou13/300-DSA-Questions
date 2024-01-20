import java.util.*;
public class RepeatAndMissingNo {
    public static int[] repeatedNumber(final int[] arr){
        Set<Integer> duplicate=new HashSet<Integer>();
        int[] ans=new int[2];
        long len=arr.length;
        long sum=0;
        for(int i=0;i<(int)len;i++){
            if(duplicate.contains(arr[i])){
                ans[0]=arr[i];
            }
            else{
                duplicate.add(arr[i]);
                sum+=arr[i];
            }
        }
        ans[1]=(int)((len*(len+1)/2)-sum);
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,3,5,6,7};
        int a[]=repeatedNumber(arr);
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
// public class Solution {
//     public int[] repeatedNumber(final int[] A) {
//     Set<Integer> nonduplicate = new HashSet<Integer>();
//     int[] arr = new int[2];
//     long lenOfArray = A.length;
//     long sumOfArray = 0;
//     for(int i = 0; i < (int)lenOfArray; i++){
//     if(nonduplicate.contains(A[i])){
//        arr[0] = A[i]; 
//     }
//     else{
//     nonduplicate.add(A[i]);
//     sumOfArray += A[i];
//     }
//     }
//     arr[1] = (int)((lenOfArray*(lenOfArray+1))/2 - sumOfArray);
//     return arr;
//     }
//     }