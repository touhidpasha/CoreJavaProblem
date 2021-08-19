import java.util.Scanner;

public class LargestOf3{
    public static void main(String args[]){
       int a,b,c;
       Scanner sc = new Scanner(System.in);
       a= sc.nextInt();
       b= sc.nextInt();
       c= sc.nextInt();
       
      if(a>b){
      

        if(a>c)
       System.out.println(a +"largest");
       else
       System.out.println(c+" is largest");
      
    }
    else if(b>c)
    System.out.println(b+" is largest");
    else 
    System.out.println(c+ " is largest");
 }
}