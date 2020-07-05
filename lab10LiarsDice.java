/* In a game of liars dice you are given the number of players and your 5 dice. Calculate the probability that a certain call will win. 
This is the probability that  nobody has that dice. */

import java.util.*;

public class lab10LiarsDice {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
            
            int numPlayers=sc.nextInt(5);
            sc.nextLine();
            String dice=sc.nextLine();
            String call=sc.nextLine();
            String s1= call.substring(0,1);
            String s2= call.substring(2,3);
            
            int k= Integer.parseInt(s1);
            double n=(numPlayers*5)-5;
            double p=(1.0/3.0);

            for (int i=0; i<9; i++)
            {
                if((dice.substring(i,i+1).compareTo(s2)==0)||(dice.substring(i,i+1).compareTo("1")==0))
                {
                k--;               
                }

            }
            double result=0;

                for (double i=k; i<=n; i++)
                {
                    double nCk=choose(n,i);
                
                double temp1=nCk*Math.pow(p,i)*Math.pow((1-p),(n-i));
                result+=temp1;

                }
                
            System.out.println(Math.round(result*100));
                   

            }
            
        
            public static  double choose( double total,  double choose){
            if(total < choose)
                return 0;
            if(choose == 0 || choose == total)
                return 1;
            return choose(total-1,choose-1)+choose(total-1,choose);
            }

    
}