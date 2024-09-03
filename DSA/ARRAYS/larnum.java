import java.util.*;

public class larnum {
  public static int largestnum(int numbers[]){
    int largest=Integer.MIN_VALUE;
    for(int i=0;i<numbers.length;i++){
      if(numbers[i]>largest){
        largest=numbers[i];
      }
    } 
    return largest;
    }
    public static void main(String[] args) {
      int numbers[]={2,4,6,7,9};
      int getlargest=largestnum(numbers);
      System.out.println("largest number in an array: " + getlargest);
  }
}