package linkedlistpack;

import java.util.Scanner;
class Queue
{
	class Node
	{
		int data;
		Node next;
		Node(int e)
		{
			data=e;
			next=null;
		}
	}
	Node front,rear;
	Queue()
	{
		rear=front=null;
	}
	public void enqueue(int e)
	{
		Node n=new Node(e);
		if(rear==null)
		{
			rear=front=n;
		}
		else
		{
			rear.next=n;
			rear=n;
		}
	}
	public void dequeue()
	{
		if(rear==null)
		{
			System.out.println("Empty Queue");
		}
		else
		{
			Node t=front;
			front=front.next;
			if(front==null)
				rear=null;
			System.out.println(t.data);
		}
		
	}
	public void print()
	{
		for(Node i=front;i!=null;i=i.next)
		{
			System.out.println(i.data);
		}
	}
}

public class QueueLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		int e;
		Queue l=new Queue();
		Scanner s=new Scanner(System.in);
		do
		{
			System.out.println("\n1.enqueue\n2.dequeue\n3.print\n0.Exit");
			ch=s.nextInt();
			switch(ch)
			{
				case 1:
					System.out.println("enqueue element");
					e=s.nextInt();
					l.enqueue(e);
					break;
				case 2:
					System.out.println("dequeue element");
					l.dequeue();
					break;
				case 3:
					System.out.println("elements in queue");
					l.print();
					break;
				case 0:
					System.out.println("Exiting");
					break;
				default:
					System.out.println("Error");
					break;
			}
		}while(ch!=0);

	}


}
