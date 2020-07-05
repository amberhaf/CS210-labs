/* Check if a credit card number is valid or not, using Luhn's algorithm. */

public class lab1LuhnsAlgorithm{

    public static void main (String[] args){

        String c="4539682995824395";
        long card=Long.parseLong(c);
        long sum=0;
        for (int i=1; i<c.length()+1; i++)
        {
            long num=card%10;
            if(i%2==0)
            {
                num=num*2;
               
                if(num>9)
                {
                    num=num-9;
                }
            }
            sum+=num;
            card=card/10;
        }
       
        if(sum%10==0)
        {
            System.out.println("Valid");
        }
        else
        {
            System.out.println("Invalid");
        }


    }

}