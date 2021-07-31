package linkedlistpack;

public class DoublyLinearLinkedList 
{
	class Node
	{
		int data;
		Node right;
		Node left;
		Node(int e)
		{
			data=e;
			right=left=null;
		}
	}
	Node root;
	DoublyLinearLinkedList()
	{
		root=null;
	}
	public void insertLeft(int e)
	{
		Node n=new Node(e);
		if(root==null)
		{
			root=n;
		}
		else
		{
			n.right=root;
			root.left=n;
			root=n;	
		}
	}
	public void deleteLeft()
	{
		if(root==null)
		{
			System.out.println("Empty List");
		}
		else
		{
			Node t=root;
			root=root.right;
			if(root!=null)//just to check when one element is pending else it will give Null Pointer Exception
			root.left=null;
			System.out.println("Delete element "+t.data);
		}
	}
	public void insertRight(int e)
	{
		Node n=new Node(e);
		if(root==null)
		{
			root=n;
		}
		else
		{
			Node t=root;
			for(t=root;t.right!=null;t=t.right);	
			t.right=n;
			n.left=t;
		}
	}
	public void deleteRight()
	{
		if(root==null)
		{
			System.out.println("Empty List");
		}
		else
		{
			Node t=root;
			Node t2=root;
			while(t.right!=null)
			{
				t2=t;
				t=t.right;
			}
			if(t==root)//for deleting last element
				root=null;
			t2.right=null;
			System.out.println("Delete Element "+t.data);
		}
	}
	public void print()
	{
		Node t= root;
		while(t!=null)
		{
			System.out.println(t.data);
			t=t.right;
		}
	}
}
