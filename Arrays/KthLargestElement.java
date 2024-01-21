public class KthLargestElement {
    public static int findKthLargest(int[] nums, int k) {
        mergeSort(nums, 0, nums.length-1);
        return nums[nums.length-k];
    }
    public static void mergeSort(int[] nums, int si, int ei){
        if(si>=ei){
            return ;
        }
        int mid=si+(ei-si)/2;
        mergeSort(nums, si, mid);
        mergeSort(nums, mid+1, ei);
        merge(nums, si, mid, ei);
    }
    public static void merge(int arr[], int si, int mid, int ei){
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        k=si;
        for(int x:temp){
            arr[k++]=x;
        }

    }
    public static void main(String[] args) {
        int arr[]={1,4,2,3,4,5,3,5,9};
        System.out.println(findKthLargest(arr, 5));
    }
}
