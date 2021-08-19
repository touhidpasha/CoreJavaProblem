public class CoinFlip{
    public static void main(String[] args) {
        int count=0,h_count=0,t_count=0;
        while(count<10)
        {
            count++;
        int die =(int) ((Math.random() * (6 - 1)) + 1);
        //int die = (int) (Math.random() * 10) % 2;
        if((die%2)==1)
        { System.out.println("head");
        h_count++;}
        else{ System.out.println("tail");
        t_count++;
        System.out.println(die%2);
        
        }
        System.out.println("percentage of head and tail are "+(h_count)+" and "+(t_count));
    }
}
}