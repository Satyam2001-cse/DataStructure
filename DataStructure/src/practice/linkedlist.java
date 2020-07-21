package practice;

import java.util.Scanner;

public class linkedlist {
	node head;
	class node
	{
		
		private int data;
		private node next;
		node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
		public void push(int d)
		{
			node nnode=new node(d);
			if(head==null)
			{
				head=nnode;
				
			}
			else
			{
				nnode.next=head;
				head=nnode;
			}
		}
		public void display()
		{
			node current=head;
			if(head==null)
			{
				System.out.println("list is empty");
			}
			while(current!=null)
			{
				System.out.println(" ");
				System.out.println(current.data);
				current=current.next;
			}
			
		}
		public void delete()
		{
			
			head=null;
		}
		public void deleteatbeg()
		{
			node temp=head;
			if(head==null)
				{
				System.out.println("list is emoty");
				}
			if(head.next==null)
			{
				head=null;
			}
			else
			{
				head=head.next;
				temp=null;
			}
				
		}
		public void deleteatend()
		{
			node last=head;
			if(head==null)
			{
				System.out.println("list is emoty");
			}
			if(head.next==null)
			{
				head=null;
			}
			else
			{
				while(last.next!=null)
				{
					last=last.next;
			   }
				
				last.next=null;
		}
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		linkedlist list =new linkedlist();
		System.out.println("1 for insert");
		System.out.println("2 for delete atbg");
		System.out.println("3 for remove all list");
		System.out.println("4 for display");
	//	System.out.println("5 for deleatbg");
		System.out.println("5 for deleteatend");
		System.out.println("6 for exit");
		
	//	System.out.println("5 for exit");
	//	System.out.println();
	
			int ch=0;
		while(ch!=6)
		{
			System.out.println("enetr your choice");
			System.out.println("  ");
			
		ch=s.nextInt();
	
		switch(ch)
		{
			case 1:
			System.out.println("enter number to be eneter");
				int n=s.nextInt();
				list.push(n);
				break;
				
			case 2:
				list.deleteatbeg();
				break;
				
			case 3:
			list.delete();
			break;
			
			case 4:
				list.display();
				break;
				
			case 5:
				list.deleteatend();
				break;
			 
			case 6:
				System.out.println("exit");
				
				
				default:
				System.out.println("invalid");
				
		}
		}
		
		//list.push(1);
		/*list.push(2);
		list.push(3);
		list.push(4);
		list.display();
		//list.delete();
		list.deleteatbeg();
		list.display();*/

	}

}
