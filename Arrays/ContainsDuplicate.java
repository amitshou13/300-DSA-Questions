//contains deuplicate in array

import java.util.HashMap;
public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> seen = new HashMap<>();
        for (int num : nums) {
            if (seen.containsKey(num) && seen.get(num) >= 1)
                return true;
            seen.put(num, seen.getOrDefault(num, 0) + 1);
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,3,5};
        System.out.println(containsDuplicate(arr));
    }
}
