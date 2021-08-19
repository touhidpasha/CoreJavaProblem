import java.util.Scanner;

public class RemaindeAndQuetion{
    public static void main(String args[]){
       int divident,diviser,q,r;
       Scanner sc = new Scanner(System.in);
       
       divident= sc.nextInt();
      diviser=sc.nextInt();
       System.out.println("remiander is "+(divident%2));
       System.out.println("quetion is "+(divident-(divident%2))/diviser);
    }
 }