package myPack;
import java.util.Scanner;

interface Stack
{
	void push(int I);
	int pop();
}

class FixedStack implements Stack
{
	Scanner sc = new Scanner(System.in);
	int[] stack ;
	int size;
	int top=0;
	FixedStack()
	{
		//System.out.println("Enter size of the variable stack : ");
		//size = sc.nextInt();
		size = 5;
		stack = new int[size];
	}
	public void push(int k)
	{
		if(top==size)
		{
			System.out.println("Stack Overflow");
		}
		else
		{
			stack[top]=k;
			top++;
			
		}
	}
	public int pop()
	{
		//int delItem = stack[top];
		top = top-1;
		System.out.println("Deleted item from stack is : "+stack[top]);
		return 0;
		
    }
	public void stackItems()
	{
		System.out.println("Stack items are : ");
		for(int i=0;i<=stack.length-1;i++)
		{
			System.out.print("\t"+stack[i]);
			
		}
		System.out.println();
	}
}

class VariableStack
{
	int vsize,top=0;
	int[] stack;
	VariableStack()
	{
		System.out.println("Enter the size of the Variable Stack :");
		Scanner sc = new Scanner(System.in);
		vsize = sc.nextInt();
		stack = new int[vsize];
	}
	public void push(int i)
	{
		if((top-1)==vsize)
		{
			vsize=vsize+1;
			top = vsize;
			stack[top]=i;
			top=top+1;
		}
		else
		{
			stack[top]=i;
			top=top+1;
		}
	}
	
	public int pop()
	{
		top = top-1;
		System.out.println("Deleted item from stack is : "+stack[top]);
		return 0;
	}
	public void vStackItems()
	{
		System.out.println("Stack items are : ");
		for(int i=0;i<=stack.length-1;i++)
		{
			System.out.print("\t"+stack[i]);
			
		}
		System.out.println();
	}
}

public class Ses5Asnment2 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		FixedStack fs = new FixedStack();
		fs.push(90);
		fs.push(40);
		fs.push(60);
		fs.push(50);
		fs.push(20);
		fs.stackItems();
		fs.pop();
		fs.push(30);
		fs.push(100);
		fs.stackItems();
		
		
		VariableStack vs = new VariableStack();
		vs.push(10);
		vs.push(20);
		vs.push(30);
		vs.push(40);
		vs.push(50);
		vs.vStackItems();
		vs.pop();
		vs.vStackItems();
		vs.push(60);
		vs.vStackItems();
		vs.push(70);
		vs.push(80);
	}

}
