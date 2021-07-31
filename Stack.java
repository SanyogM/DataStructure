package stackpack;

public class Stack 
{
	int s[],size,e,tos;
	
	Stack(int size)
	{
		this.size=size;
		tos=-1;
		s=new int[size];
	}
	
	public void push(int e)
	{
		tos++;
		s[tos]=e;
	}
	
	public int pop()
	{
		int t = s[tos];
		tos--;
		return t;
	}
	
	public int atPeak()
	{
		return s[tos];
	}
	
	public boolean isFull()
	{
		if(tos==size-1)
			return true;
		else
			return false;
	}
	
	public boolean isEmpty()
	{
		if(tos==-1)
			return true;
		else
			return false;
	}
	
	public void print()
	{
		for(int i=tos;i>=0;i--)
			System.out.println(s[i]);
	}
}
