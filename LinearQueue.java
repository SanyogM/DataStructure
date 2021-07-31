package queuepack;

public class LinearQueue 
{
	int front,rear,size,Q[];
	
	LinearQueue(int size)
	{
		this.size=size;
		Q=new int[size];
		front = 0;
		rear= -1;
	}
	
	public void Enqueue(int e)
	{
		rear++;
		Q[rear]=e;
	}
	
	public int Dequeue()
	{
		int t = Q[front];
		front++;
		return t;
	}
	
	public boolean isFull()
	{
		if(rear==size-1)
			return true;
		else
			return false;
	}
	
	public boolean isEmpty()
	{
		if(front>rear)
			return true;
		else
			return false;
	}
	
	public void print()
	{
		for(int i=front;i<=rear;i++)
		{
			System.out.println(Q[i]);
		}
	}
}
