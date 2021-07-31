package linkedlistpack;

public class LinearLinkedList 
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
	Node root;
	
	public LinearLinkedList() 
	{
		root=null;
	}

	public void insertLeft(int e)
	{
		Node n = new Node(e);
		if(root==null)
			root = n;
		else
		{
			n.next=root;
			root=n;
		}
	}
	
	public void deleteLeft()
	{
		if(root==null)
			System.out.println("Empty");
		else
		{
			Node t = root;
			root=root.next;
			System.out.println("Deleted element:"+t.data);
		}
	}
	
	public void insertRight(int e)
	{
		Node n = new Node(e);
		if(root == null)
			root=n;
		else
		{
			Node t = root;
			while(t.next!=null)
			{
				t=t.next;
			}
			t.next=n;
		}
	}
	
	public void deleteRight()
	{
		if(root==null)
			System.out.println("Empty");
		else
		{
			Node t=root;
			Node t2=root;
			while(t.next!=null)
			{
				t2=t;
				t=t.next;
			}
			if(t==root)
				root=null;
			t2.next=null;
			System.out.println("Deleted element:"+t.data);
		}
	}
	
	public void print()
	{
		if(root == null)
			System.out.println("Empty.");
		else
		{
			Node t = root;
			while(t!=null)
			{
				System.out.println(t.data);
				t=t.next;
			}
		}
	}
	
	public void searchKey(int key)
	{
		if(root==null)
			System.out.println("Empty");
		else
		{
			Node t = root;
			while(t!=null)
			{
				if(t.data==key)
					{
						System.out.println("Key Found");
						break;
					}
				t=t.next;
			}
			if(t==null)
				System.out.println("Key Not Found");
		}
	}
	
	public void deleteKey(int key)
	{
		if(root==null)
			System.out.println("Empty");
		else
		{
			Node t,t2;
			t=t2=root;
			while(t!=null && t.data!=key)
			{
				t2=t;
				t=t.next;
			}
			if(t==null)
				System.out.println("Not Found");
			else
			{
				if(t==root)//case1 deleteLeft
					root=root.next;
				else if(t.next==null)
					t2.next=null;//case2 deleteRight
				else//in between
					t2.next=t.next;
				System.out.println("Deleted:"+t.data);
			}
		}
	}
	
	public int countNodes()
	{
		int c=0;
		Node t  = root;
		while(t!=null)
		{
			c++;
			t=t.next;
		}
		return c;
	}
	
	public int findMid()
	{
		Node t,t2;
		t=t2=root;
		while(t.next!=null && t.next.next!=null)
		{
			t=t.next.next;
			t2=t2.next;
		}
		return t2.data;
	}
}























