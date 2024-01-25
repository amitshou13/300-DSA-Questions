import java.util.*;
public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int count=0;
        int max=0;
        int i=0;
        int j=height.length-1;
        while(i<j){
            count=Math.min(height[i],height[j])*(j-i);
            max=Math.max(count, max);
            if(height[i]<height[j]){
                i++;
            }
            else if(height[i]>height[j]){
                j--;
            }
            else{
                i++;
                j--;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,18,17,6};
        System.out.println(maxArea(arr));
    }
}
