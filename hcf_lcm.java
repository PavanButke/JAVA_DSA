import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      Scanner scan= new Scanner(System.in);
      int n1= scan.nextInt();
      int n2= scan.nextInt();
      
        int divisor=n1;
        int dividend=n2;
        int hcf=0; 
      while(dividend % divisor !=0){
          int rem=dividend % divisor;
          dividend=divisor;
          divisor=rem;
      }
      hcf=divisor;
      int lcm= (n1*n2)/hcf ;
      System.out.println(hcf);
      System.out.println(lcm);
     }
    }