/* In this task the input is two numbers, followed by a series of strings.
Those strings must be sorted and then one particular string must be outputted.
The first number denotes the quantity of strings to follow.
The second number indicates which string should be outputted following the sort. 
For example, if it's a 3, then output the string that falls in third place. 
If it's a 5 then output the string that falls in fifth place. 
The sorting that should be applied is as follows: sort words by their length, with the shortest words coming first.
If two words have the same length, then sort them in reverse alphabetical order (i.e. with "zoo" coming ahead of "ape").*/

import java.util.Scanner;

public class lab5SortingArray {
    public static void main(String[] arg) {
        Scanner scan= new Scanner(System.in);
        int l=scan.nextInt();
        int n=scan.nextInt();
        scan.nextLine(); 
        String a[]=new String[l];

        for(int i=0; i<l; i++)
        {
            a[i]=scan.nextLine();
        }

        for(int j=0; j<l;j++)
        {
            for(int i=0; i<l-1; i++)
            {
                if(a[i].length()>a[i+1].length())
                {
                    String t=a[i];
                    a[i]=a[i+1];
                    a[i+1]=t;
                }
                else if(a[i].length()==a[i+1].length()&&(a[i].compareTo(a[i+1])<0))
                {

                        String t=a[i];
                        a[i]=a[i+1];
                        a[i+1]=t;                
                }

            }                
        }
        System.out.println(a[n-1]);
        
    }
}