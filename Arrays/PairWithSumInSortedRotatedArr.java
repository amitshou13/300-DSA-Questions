public class PairWithSumInSortedRotatedArr {
    public static boolean pairWithSum(int sum, int arr[]){
        int idx=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1])
                idx=i;
        }
        int n=arr.length;
        int i=(idx+1)%n;
        int j=idx;
        while(i!=j){
            int s=arr[i]+arr[j];
            if(s==sum){
                return true;
            }
            else if(s<sum){
                i=(i+1)%n;
            }
            else{
                j=(n+j-1)%n;
            }
        }
        return false;
    }
 
    public static void main(String[] args) {
        int arr[]={11, 15, 26, 38, 9, 10};
        System.out.println(pairWithSum(45, arr));
    }
}