

////Pending !!!!!!
package linkedlistpack;
import java.util.Scanner;
class Stack
{
	class Node
	{
		int data;
		Node next;
		Node(int e)
		{
			data =e;
			next=null;
		}
	}
	Node tos;
	Stack()
	{
		tos=null;
	}
	public void push(int e)
	{
		Node n=new Node(e);
		if(tos==null)
		{
			tos=n;
		}
		else
		{
			n.next=tos;
			tos=n;
		}
	}
	public void pop()
	{
		if(tos==null)
		{
			System.out.println("Empty Stack");
		}
		else
		{
			Node t=tos;
			tos=tos.next;
			System.out.println("Poped element "+t.data);
		}
	}
	public void print()
	{
		for(Node i=tos;i!=null;i=i.next)
		{
			System.out.println(i.data);
		}
	}
}
public class StackLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		int e;
		Stack l=new Stack();
		Scanner s=new Scanner(System.in);
		do
		{
			System.out.println("\n1.push\n2.pop\n3.print\n0.Exit");
			ch=s.nextInt();
			switch(ch)
			{
				case 1:
					System.out.println("push element");
					e=s.nextInt();
					l.push(e);
					break;
				case 2:
					System.out.println("pop element");
					l.pop();
					break;
				case 3:
					System.out.println("elements in stack");
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
