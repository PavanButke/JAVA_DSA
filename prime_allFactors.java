import java.util.*;

public class Main{

public static void main(String[] args) {
  Scanner scan= new Scanner(System.in);
    int num=scan.nextInt();
    
    int div = 2;
    while(div * div <=  num){
        if(num % div==0){
            System.out.print(div + " ");
            num=num/div;
        }
        else{
        div++;
        }
    }
 
    System.out.println(num);
}
 
}