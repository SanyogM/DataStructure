package linkedlistpack;

import java.util.Scanner;

public class DoublyLinearLinkedListImpl 
{
	public static void main(String[] args)
	{
			int ch;
			int e;
			DoublyLinearLinkedList l=new DoublyLinearLinkedList();
			Scanner s=new Scanner(System.in);
			do
			{
				System.out.println("\n1.insertLeft\n2.insertRight\n3.deleteLeft\n4.deleteRight\n5.print\n0.Exit");
				ch=s.nextInt();
				switch(ch)
				{
					case 1:
						System.out.println("Enter element from left");
						e=s.nextInt();
						l.insertLeft(e);
						break;
					case 2:
						System.out.println("Enter element from right");
						e=s.nextInt();
						l.insertRight(e);
						break;
					case 3:
						System.out.println("Delete element from left");
						l.deleteLeft();
						break;
					case 4:
						System.out.println("Delete element from right");
						l.deleteRight();
						break;
					case 5:
						System.out.println("Elements in List are");
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
