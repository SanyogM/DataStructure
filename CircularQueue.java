package queuepack;

public class CircularQueue 
{
	int front,rear,count,size,CQ[];
	
	CircularQueue(int size)
	{
		this.size=size;
		CQ=new int[size];
		front = 0;
		rear= -1;
		count= 0;
	}
	
	public void Enqueue(int e)
	{
		count++;
		rear=(rear+1)%size;
		CQ[rear]=e;
	}
	
	public int Dequeue()
	{
		count--;
		int t = CQ[front];
		front=(front+1)%size;
		return t;
	}
	
	public boolean isFull()
	{
		if(count==size)
			return true;
		else
			return false;
	}
	
	public boolean isEmpty()
	{
		if(count==0)
			return true;
		else
			return false;
	}
	
	public void print()
	{
		int c=0,i=front;
		while(c<count)
		{
			System.out.println(CQ[i]);
			i=(i+1)%size;
			c++;
		}
	}
}
