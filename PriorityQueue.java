package queuepack;

public class PriorityQueue 
{
int front,rear,size,PQ[];
	
	PriorityQueue(int size)
	{
		this.size=size;
		PQ=new int[size];
		front = 0;
		rear= -1;
	}
	
	public void Enqueue(int e)
	{
		int i,j,t;
		rear++;
		PQ[rear]=e;
		
		for(i=front;i<rear;i++)
		{
			for(j=front;j<rear;j++)
			{
				if(PQ[j]>PQ[j+1])
				{
					t = PQ[j];
					PQ[j]=PQ[j+1];
					PQ[j+1]=t;
				}
			}
		}
	}
	
	public int Dequeue()
	{
		int t = PQ[front];
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
			System.out.println(PQ[i]);
		}
	}
}
