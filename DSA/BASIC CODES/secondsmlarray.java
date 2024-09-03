import java.util.*;
public class secondsmlarray{
    public static int secsml(int numbers[]){
        int smallest=Integer.MAX_VALUE;
        int ssmallest=1;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<smallest){
            ssmallest=smallest;
            smallest=numbers[i];
            }
            else
            {
            if(numbers[i]< smallest && numbers[i]>ssmallest)
            ssmallest=numbers[i];

        }
    }
    return ssmallest;
}
public static void main(String args[]){
    int numbers[]={4,2,41,34,28,18};
    int get=secsml(numbers);
    System.out.println("smallest in array: " + get);
}
}