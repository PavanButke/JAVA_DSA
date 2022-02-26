// ****  ****
// ***    ***
// ****  **** 



import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n= scan.nextInt();
        
        int stc=(n+1)/2;
        int spc=1;
    
        for(int r=1; r<=n;r++)
        {
            for(int i=1;i<=stc;i++)
            {
                System.out.print("*	");
            }
            for(int i=1; i<=spc;i++)
            {
                System.out.print("	");
            }
            
            for(int i=1; i<=stc;i++ )
            {
                System.out.print("*	");
            }
            
            System.out.println();
            
            if(r<=n/2)
            {
                stc--;
                spc+=2;
            }
            else if(r> n/2)
            {
                stc++;
                spc-=2;
            }
        }

    }
}