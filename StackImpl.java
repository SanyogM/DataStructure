package stackpack;

import java.util.Scanner;

public class StackImpl 
{

	public static void main(String[] args) 
	{
		int n,ch,e;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of stack");
		n = sc.nextInt();
		
		Stack ob=new Stack(n);
		do
		{
			System.out.println("Enter your choice\n1.Push\n2.Pop\n3.Print\n4.Peak\n0.Exit");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					if(ob.isFull()==false)
						{
							System.out.println("Enter element");
							e=sc.nextInt();
							ob.push(e);
						}
					else
						System.out.println("Full");
					break;
					
				case 2:
					if(ob.isEmpty()==false)
					{
						System.out.println("Popped element is:"+ob.pop());
					}
					else
						System.out.println("Empty!!");
					break;
				
				case 3:
					System.out.println("Stack elements are:");
					ob.print();
					break;
					
				case 4:
					if(ob.isEmpty()==false)
					{
						System.out.println("Peak Element is:"+ob.atPeak());
					}
					else
						System.out.println("Empty");
					break;
					
				case 0:
					System.out.println("Exiting..!");
					break;
					
				default:
					System.out.println("Wrong input");
					break;
			}
		}while(ch!=0);
	}
}
