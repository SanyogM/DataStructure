package linkedlistpack;

public class CircularLinkedList 
{
	class Node
	{
		int data;
		Node next;
		
		public Node(int data) 
		{
			this.data = data;
			next = null;
		}	
	}
	Node root,last;
	
	public CircularLinkedList() 
	{
		root=null;
	}
	
	public void insertLeft(int e)
	{
		Node n = new Node(e);
		if(root==null)
		{
			root=last=n;
			last.next = root;
		}
		else
		{
			n.next=root;
			root=n;
			last.next=root;
		}
	}
	
	public void deleteLeft()
	{
		if(root==null)
			System.out.println("Empty");
		else
		{
			Node t = root;
			if(root==last)
				root=null;
			else
			{
				root=root.next;
				last.next=root;
			}
			System.out.println("Deleted:"+t.data);
		}
	}
	
	public void insertRight(int e)
	{
		Node n = new Node(e);
		if(root==null)
		{
			root=last=n;
			last.next = root;
		}
		else
		{
			last.next=n;
			last=n;
			n.next=root;
		}
	}
	
	public void deleteRight()
	{
		if(root==null)
			System.out.println("Empty");
		else
		{
			Node t,t2;
			t=t2=root;
//			while(t!=last) //(t.next!=null)
//			{
//				t2=t;
//				t=t.next;
//			}
//			last=t2;
//			last.next=root; //t2.next=root
			if(root==last)
			{
				root=null;
			}
			else
				{
					while(t.next!=root)
					{
						t2=t;
						t=t.next;
					}
					last=t2;
					last.next=root;
				}
			System.out.println("Deleted:"+t.data);
		}
	}
	
	public void print()
	{
		if(root == null)
			System.out.println("Empty");
		else
		{
			Node t=root;
			do											//			while(t!=root)					
			{											//			{
				System.out.println(t.data);				//				System.out.println(t.data);
				t=t.next;								//				t=t.next;
			}while(t!=root);							//			}
		}
	}
	
	public void searchKey(int key)
	{
		if(root == null)
			System.out.println("Empty");
		else
		{
			int flag=0;
			Node t = root;
			do
			{
				if(t.data==key)
				{
					System.out.println("Key found");
					flag=1;
					break;
				}
				t=t.next;
			}while(t!=root);
			if(flag==0)
			System.out.println("Key Not Found"); 
		}
	}
	
//	public void deleteKey(int key)
//	{
//		if(root == null)
//			System.out.println("Empty");
//		else
//		{
//			Node t,t2;
//			t=t2=root;
//			while(t.data!=key && t!=null)
//			{
//				t2=t;
//				t=t.next;
//			}
//		}
//	}
}



























