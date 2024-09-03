import java.util.*;
public class inputfromuser {
    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
    System.out.println("enter the array size");
      int size=sc.nextInt();
      int arr[]=new int[size];
      System.out.println("enter the array elements");
      for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
      }
      System.out.print("array elemets :");
      for(int i=0;i<size;i++){
      System.out.print(arr[i] + " ");
  }
}
}
