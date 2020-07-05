/* Give the radius of a coin, it's thickness and a target overhang over the edge of a table.
What's the minimum height of the tower of coins needed to achieve that overhang? */

public class lab2OverHangingBlock{
    public static void main (String[] args){

        double rad=8;
        double target=10;
        double thickness=2;
        double overhang=0;
        int count=0;
       
        while(overhang<target)
        {
            count++;
            rad=1/rad*count;
            overhang=overhang+rad;
        }
        System.out.println(thickness*count);

    }

}