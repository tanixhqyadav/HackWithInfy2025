import java.util.*;
public class Minimum_number_Coins{
    public static void main(String[] args) {
        int n=43;
        List<Integer> result = minPartition(n);
        System.out.println("Minimum coins to make " + n + ": " + result);
    }
    // User function Template for Java

    public static List<Integer> minPartition(int n) {
        int ar[]={1,2,5,10,20,50,100,200,500,2000};
        List<Integer> l=new ArrayList<>();
        int s=0;
        for(int i=ar.length-1;i>=0;i--){
            if(ar[i]<=n){
                while(n>=ar[i]){
                    n-=ar[i];
                    l.add(ar[i]);
                }
            }
            if(n==0){
                break;
            }
        }
        return l;
    }

}