import java.util.*;
public class creation {
    public static void main(String args[]){
      //Array Creation
      int marks[]=new int[5];
      System.out.print("enter the marks");
      Scanner sc = new Scanner(System.in);
      marks[0]=sc.nextInt();
      marks[1]=sc.nextInt();
      marks[2]=sc.nextInt();
      System.out.println("phy " + marks[0]);
      System.out.println("maths " + marks[1]);
      System.out.println("chem " + marks[2]);
    }
}