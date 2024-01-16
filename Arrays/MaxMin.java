// Maximum and Minimum Element in an Array
import java.util.*;

public class MaxMin {
    static Pair getMinMax(long a[], long n) {
        long max = 0;
        long min = Long.MAX_VALUE;
        for (long i : a) {
            max = Math.max(max, i);
            min = Math.min(min, i);
        }
        return new Pair(min, max);
    }

    public static void main(String[] args) {
        long arr[] = { 1, 9, 3, 5, 0, 11, 47 };
        Pair p = getMinMax(arr, arr.length);
        System.out.print(p.first + " " + p.second);
    }
}

class Pair {
    long first, second;

    public Pair(long first, long second) {
        this.first = first;
        this.second = second;
    }
}