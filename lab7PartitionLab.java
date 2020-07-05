/* Given an array of numbers choose which of these numbers 
to add and subtract in order to get as close to 0 as possible. */

import java.util.Scanner;

public class lab7PartitionLab {
    public static void main(String[] args) {
        int size =10;
        int[] original={10,2,66,38,501,26,90,73,9,16};
        //copy array
        int[] array= new int[size];

        for(int i=0; i<size; i++)
        {
            array[i]=original[i];
        }

        String[] results= new String [size];
        String[] finished= new String [size];

        int pos=0;
        int neg=0;
        int sum=0;
        

        for(int j=0; j<array.length; j++)
        {
            for(int i=1; i<array.length; i++)
            {
                int first=array[i-1];
                int second=array[i];
               if(array[i-1]<0)
               {
                    first=-1*array[i-1];
               }
               if(array[i]<0)
               {
                    second=-1*array[i];
               }
            
                if(first>second)
                {
                    int temp = array[i];
                    array[i] = array[i-1];
                    array[i-1] = temp;
                }              
            }
        }

        for(int i=array.length-1; i>=0; i--)
        {
            System.out.println(array[i]);
            if(neg>pos && array[i]>0)
            {
                pos=pos+array[i];
                sum+=array[i];
                results[i]="+";
            }
            else
            {
                neg=neg+array[i];
                sum-=array[i];
                results[i]="-";
            }
        }

        for(int i=0; i <size; i++)
        {
            for(int j=0; j<size; j++)
            {
                if(original[i]==array[j])
                {
                    System.out.println(original[i]+ results[i]);
                    array[j]=0;
                    finished[i]=results[j];
                }
            }
        }
    }
}