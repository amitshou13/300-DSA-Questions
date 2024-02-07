// Minimum number of Coins

/*Given an infinite supply of each denomination of 
Indian currency { 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 } 
and a target value N.
Find the minimum number of coins and/or notes 
needed to make the change for Rs N. You must 
return the list containing the value of coins required. 
*/

 import java.util.*;
 public class MinNoOfCoins{
    static List<Integer> minPartition(int N)
    {
        List<Integer> al=new ArrayList<>();
        int arr[]={2000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        for(int i=0;i<arr.length;i++){
            while(arr[i]<=N){
                al.add(arr[i]);
                N=N-arr[i];
            }
        }
        return al;
        
    }
    public static void main(String[] args) {
        for(Integer i:minPartition(43)){
            System.out.print(i+" ");
        }
    }
}