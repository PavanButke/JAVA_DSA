//        *
//    *   *  *
//  *  *  *  *  *
//     *  *  *
//        *
import java.util.*;

public class Main {

    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
	        int n= scan.nextInt();
	        
	        int sp = n/2;
	        int st = 1;
	        for(int row=1; row<= n ; row++)
	        {
	              for(int i=1 ; i<=sp ;i++)
	              {
	              System.out.print("	");
	              
	                 }
	        for(int i=1 ; i<= st ; i++)
	        {
	              System.out.print("*	");
	        }
	                    System.out.println();
	        
	        if(row <=n/2)
	        {
	              sp--;
	              st+=2;
	              
	        }
	        else if(row >n/2){
	              sp++;
	              st-=2;
	        }
	}

    }
}