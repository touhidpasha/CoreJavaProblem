import java.util.Scanner;

public class Harmonic{

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n,i;
       float s=0;
       n=sc.nextInt();
       for (i=1;i<=n;i++)
       {
           s=s+(float )(1/i);
       }
       System.out.println(s);
  
  }
}