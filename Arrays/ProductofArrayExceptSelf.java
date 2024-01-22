//find product of array elements except itself
public class ProductofArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int pro=1;
        int zeroes=0;
        for(int i:nums){
            if(i==0){
                zeroes++;
                continue;
            }
            pro*=i;
        }

        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                if(zeroes==1){
                    ans[i]=pro;
                }
                else{
                    ans[i]=0;
                }
            }
            else  if(nums[i]!=0 && zeroes!=0){
                ans[i]=0;
            }
            else{
                ans[i]=(pro/nums[i]);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,-2,0,5,3};
        int ans[]=productExceptSelf(arr);
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}
