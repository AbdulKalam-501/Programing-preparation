import java.util.*;
public class secondlararray{
    public static int seclar(int numbers[]){
        int largest=Integer.MIN_VALUE;
        int slargest=-1;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>largest){
            slargest=largest;
            largest=numbers[i];
            }
            else
            {
            if(numbers[i]<largest && numbers[i]>slargest)
            slargest=numbers[i];

        }
    }
    return slargest;
}
public static void main(String args[]){
    int numbers[]={4,2,41,34,28,18};
    int get=seclar(numbers);
    System.out.println("slargest in array: " + get);
}
}