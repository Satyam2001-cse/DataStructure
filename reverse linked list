package practice;

public class reverselinkedlist {
	class node
	{
		int data;
		node next;
		node(int data)
		{
			this.data=data;
			 next=null;
		}
		
	}
	node head;
	public void insert(int data)
	{
		node new_node=new node(data);
		node temp=head;
		if(head==null)
		{
			head=new_node;
		}
		else
		{
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=new_node;
	}
	}
	public static node reverse(node head)
	{
		node prev=null;
		node next=head;
		node current=head;
		while(current!=null)
		{
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		return prev;
	}
	public void print(node prev)
	{
		node temp=prev;
		while(temp!=null)
		{
		System.out.println(temp.data);
		temp=temp.next;
		}
	}
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		reverselinkedlist l=new reverselinkedlist() ;
		l.insert(1);
		l.insert(2);
		l.insert(3);
		l.insert(4);
		node r=reverse(l.head);
		l.print(r);

	}

}
