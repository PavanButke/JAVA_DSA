// what is number is not a prime number?
// The number which can be divided by more than 2 times.

import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        
        for(int i=1 ; i<=t ; i++)
    {
        int num= scan.nextInt();
        boolean isPrime= true;
        
            for(int div= 2 ; div*div<=num ; div++){
            if(num % div==0)
            {
                isPrime=false;
                break;
            }
    }
    if(isPrime == true)
    {
        System.out.println("prime");
    }
    else {
        System.out.println("not prime");
    }
        
  
   }}
  }