/* If you snap a spaghetto in 2 random places and you're allowed to take a nibble up to a given % off one of the pieces.
What's the probability you can make a triangle? Use a Monte Carlo simulation to find out: */

public class lab4MonteCarlo {
    public static void main(String args[]) {
        double n=0.43;
         int count=0;
         
        for(int i=0; i<100000000; i++)
        {
            double one=Math.random();
            double two=Math.random();
           
            double piece1=Math.min(one,two);
            double piece2=(Math.max(one,two)-piece1);
            double piece3=1-piece1-piece2;
           
            if((piece1+piece2>piece3-(piece3*n))&&(piece3+piece2>piece1-(piece1*n))&&(piece1+piece3>piece2-(piece2*n)))
            {
                count++;
            }
        }
        System.out.println(count);
       
    }
}