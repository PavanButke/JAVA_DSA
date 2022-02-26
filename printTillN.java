import java.util.*;

public class Main{
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        int low = scan.nextInt();
        int hi = scan.nextInt();
    
    for (int num= low ; num<=hi ; num++)
    {
       boolean isPrime= true;
       
       for(int div=2; div*div<=num ;div++ )
    {
        if(num % div==0)
        {
            isPrime=false;
            break;
        }
    }
        if(isPrime==true)
        {
            System.out.println(num);
        }
    }
    }
    
}