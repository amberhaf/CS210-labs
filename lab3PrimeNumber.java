/*Find the quantity of primes between a lower and an upper bound.*/

public class lab3PrimeNumber{

    public static void main (String[] args){

        int n=2;
        int m=98;
       
        int upper=Math.max(n,m);
        int lower=Math.min(n,m);
        int count=0;
       
        for(int i=Math.max(2,lower); i<=upper; i++)
        {
            boolean prime=true;
       
            for(int j=2; j<=Math.sqrt(i); j++)
            {
                if(i%j==0)
                {
                    prime=false;
                }
            }
            if(prime)
            {
                count++;
            }
        }
        System.out.println(count);
       

    }

}