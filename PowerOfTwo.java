public class PowerOfTwo{

    public static void main(String[] args) {
        double var=0,n=1;
        double var1=(Integer.parseInt( args[0]))^2;
        while(true)
        {
            var=Math.pow(2, n);
            System.out.println(var);
            n++;
            if(var1<var)
            break;
        }
  
  }
}