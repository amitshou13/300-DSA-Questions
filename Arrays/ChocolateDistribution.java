//Chocolate distribution problem
import java.util.*;
public class ChocolateDistribution{
    public static long findMinDiff (ArrayList<Integer> a, int n, int m){
        Collections.sort(a); //5 7 11 12 13 13 
        long diff=Integer.MAX_VALUE;
        long min=Integer.MAX_VALUE;
        int j=m-1;
        for(int i=0;i<=n-m;i++){
            diff=a.get(j)-a.get(i);
            min=Math.min(min, diff);
            j++;
        }
        return min;
    }
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(3);
        a.add(4);
        a.add(1);
        a.add(9);
        a.add(56);
        a.add(7);
        a.add(9);
        a.add(12);
        System.out.println(findMinDiff(a, 8, 5));
    }
}