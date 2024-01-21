//trapping rain water leetcode 42
public class TrappingRainWater {
    public static int trap(int[] height) {
        int len=height.length;
        int leftHeight[]=new int[len];
        leftHeight[0]=height[0];
        for(int i=1;i<len;i++){
            leftHeight[i]=Math.max(leftHeight[i-1], height[i]);
        }

        int rightHeight[]=new int[len];
        rightHeight[len-1]=height[len-1];
        for(int i=len-2;i>=0;i--){
            rightHeight[i]=Math.max(rightHeight[i+1], height[i]);
        }

        int trappedWater=0;
        for(int i=0;i<len;i++){
            trappedWater+=Math.min(leftHeight[i], rightHeight[i])-height[i];
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int arr[]={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(arr));
    }
}
