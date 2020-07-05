/* Print out nth digit after the decimal point for a fraction using recursion */

import java.util.Scanner;

public class lab9LongDivision {
    public static void main(String args[] ){
        Scanner myscanner = new Scanner(System.in);
        int numerator = myscanner.nextInt();
        int divisor = myscanner.nextInt();
        int n = myscanner.nextInt();
        System.out.println(decimal(numerator,divisor,n));
    }
    
    public static int decimal(int numerator, int divisor, int n){


    int rem=0;
    rem=numerator%divisor;
    rem=rem*10;
   
    if(n>1)
    {
     numerator=rem % divisor;
      n--;
      return decimal(numerator, divisor, n);
 
    }
    else
    {
    return(rem/ divisor);
    }
   }  
}