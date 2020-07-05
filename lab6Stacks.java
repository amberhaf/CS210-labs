/* In this task you will get a set of instructions to get from a home location to a destination location.
You have to give the instructions which begin at the destination location and return to the home location. In other words, you need to reverse the directions. Sometimes a mistake will be make with the directions, meaning that the latest direction should be deleted. The possible set of directions is "Go North", "Go South", "Go East" and "Go West". Another possible instruction is "Go Back" which means to undo the latest step.
The instruction "Arrived" means the sequence of directions is complete. */

import java.util.Scanner;

public class lab6Stacks {
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int front=0;
    long num=0;
    Stack stack1= new Stack(1000);

    stack1.push(0);
    while(num!=6)
    {
        String input =sc.nextLine();
        if(input.compareTo("Go North")==0)
        {
            num=1;
        }
        else if(input.compareTo("Go South")==0)
        {
            num=2;
        }
        else if(input.compareTo("Go East")==0)
        {
            num=3;
        }
        else if(input.compareTo("Go West")==0)
        {
            num=4;
        }
        else if(input.compareTo("Go Back")==0)
        {
            num=5;
        }
        else if(input.compareTo("Arrived")==0)
        {
            num=6;
        }
        stack1.push(num);
    }


    while(num!=0)
    {
         num=stack1.pop();
    
        if(num==2)
        {
            System.out.println("Go North");
        }
        else if(num==1)
        {
            System.out.println("Go South");
        }
        else if(num==4)
        {
            System.out.println("Go East");
        }
        else if(num==3)
        {
            System.out.println("Go West");
        }
        else if(num==5)//go back
        {        
            stack1.pop();
        }
    }
  }

static class Stack{

    private int maxSize;
    private long[] stackArray;
    private int top; 
    public Stack(int s) {
    maxSize = s;
    stackArray = new long[maxSize]; 
    top = -1;
    }
        public void push(long j) { 
        top++;
        stackArray[top] = j; 
        }
        public long pop() {
        return stackArray[top--];
        }
        public long peek() {
        return stackArray[top];
        }
       
}
}