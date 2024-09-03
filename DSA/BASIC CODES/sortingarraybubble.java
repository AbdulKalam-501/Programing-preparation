/*import java.util.Arrays;
import java.util.*;

class sortingarraybubble {
  static void bubbleSortAlgorithm(int array[]) {
    int size = array.length;
    
    for (int i = 0; i < size - 1; i++)
    
      for (int j = 0; j < size - i - 1; j++)
      
        if (array[j] > array[j + 1]) {
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
          
        }
  }
  
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the array size");
    int size=sc.nextInt();
    int data[]=new int[size];
    System.out.println("Enter the array elements");
    for(int i=0;i<size;i++)
    {
      data[i]=sc.nextInt();
    }
    System.out.println("Array elemnts");
    for(int i=0;i<size;i++){
      System.out.print(data[i] + " ");
    }
  bubbleSortAlgorithm(data);
    
    System.out.println("The array performing the Bubble Sort Algorithm is:");
    System.out.println(Arrays.toString(data));
  }
}*/
import java.util.Arrays;

class sortingarraybubble {
  static void bubbleSortAlgorithm(int array[]) {
    int size = array.length;
    
    for (int i = 0; i < size - 1; i++)
    
      for (int j = 0; j < size - i - 1; j++)
      
        if (array[j] > array[j + 1]) {
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
          
        }
  }
  
  public static void main(String args[]) {
    int[] data = { 6, 5, 8, 1, 2 };
    
    bubbleSortAlgorithm(data);
    
    System.out.println("The array performing the Bubble Sort Algorithm is:");
    System.out.println(Arrays.toString(data));
  }
}