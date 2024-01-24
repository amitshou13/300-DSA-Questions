//find all pairs with given sum
import java.util.*;

class pair  {  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}

public class GivenSumPair {
    public pair[] allPairs( long A[], long B[], long X) {
        Arrays.sort(A);
        Arrays.sort(B);
        ArrayList<pair> a=new ArrayList<>();
        
        int i=0;
        int j=B.length-1;
        
        while(i<A.length && j>=0){
            if(A[i]+B[j]==X){
                pair p=new pair(A[i],B[j]);
                a.add(p);
                i++;
                j--;
            }
            else{
                if(A[i]+B[j]<X){
                    i++;
                }
                else{
                    j--;
                }
            }
        }
        pair pairs[]=new pair[a.size()];
        pairs=a.toArray(pairs);
        
        return pairs;
    }
    public static void main(String[] args) {
        long A[]={1, 2, 4, 5, 7};
        long B[]={5, 6, 3, 4, 8};
        long X=9;
        GivenSumPair obj=new GivenSumPair();
        pair[] answer=obj.allPairs(A,B,X);
        if(answer.length==0){
            System.out.println(-1);
        }
        else{
            StringBuilder output=new StringBuilder();
            for(int i=0;i<answer.length;i++){
                if(i<answer.length-1){
                    output.append(answer[i].first+" "+ answer[i].second+",");
                }
                else{
                    output.append(answer[i].first+" "+answer[i].second);
                }
            }
            System.out.println(output);
        }
    }
}
