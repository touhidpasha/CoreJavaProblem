import java.util.Scanner;

public class Swap{
    public static void main(String args[]){
       int a,b,t;
       Scanner sc = new Scanner(System.in);
       
       a= sc.nextInt();
      b=sc.nextInt();
      System.out.println("before swap "+a+" "+b);
      t=a;
      a=b;
      b=t;
       System.out.println("after swap "+a+" "+b);
      
    }
 }