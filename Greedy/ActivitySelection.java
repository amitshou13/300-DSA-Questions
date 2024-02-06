// ActivitySelection 
/*
Given N activities with their start and finish day 
given in array start[ ] and end[ ]. Select the 
maximum number of activities that can be performed 
by a single person, assuming that a person can only 
work on a single activity at a given day.
Note : Duration of the activity includes both starting and ending day.
 */

import java.util.*;
public class ActivitySelection
{
    //Function to find the maximum number of activities that can
    //be performed by a single person.
    public static int activitySelection(int start[], int end[], int n)
    {
        int arr[][]=new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=start[i];
            arr[i][1]=end[i];
        }
        Arrays.sort(arr, Comparator.comparingInt(a->a[1]));
        
        int count=1;
        int last=arr[0][1];
        for(int i=1;i<n;i++){
            if(arr[i][0]>last){
                count++;
                last=arr[i][1];
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int start[]={1,3,2,5};
        int end[]={2,4,3,6};
        System.out.println(activitySelection(start, end, start.length));
    }
}