import java.util.*;
public class linearsearch {
  public static int linearsearch(int numbers[],int key){
    for(int i=0;i<numbers.length;i++)
    {
      if(numbers[i]==key)
      return i;
    }
    return -1;
  }
    public static void main(String[] args) {
      int numbers[]={2,4,6,8,10,12,40};
      int key=8;
      int index=linearsearch(numbers,key);
      if(index==-1){
       System.out.println("not found"); 
      }
      else
      {
        System.out.println("element found at index " + index); 
      }
  }
}
