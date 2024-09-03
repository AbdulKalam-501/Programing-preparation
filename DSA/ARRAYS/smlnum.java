import java.util.*;

public class smlnum{
  public static int smallestnum(int numbers[]){
    int smallest=Integer.MAX_VALUE;
    for(int i=0;i<numbers.length;i++){
      if(numbers[i]<smallest){
        smallest=numbers[i];
      }
    } 
    return smallest;
    }
    public static void main(String[] args) {
      int numbers[]={2,4,6,7,9};
      int getsmallest=smallestnum(numbers);
      System.out.println("smallest number in an array: " + getsmallest);
  }
} 
    