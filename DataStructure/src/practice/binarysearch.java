package practice;

import java.util.Scanner;

public class binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s= new Scanner(System.in);
		System.out.println("size of array");
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("enter element to be search");
		int x=s.nextInt();
		b.binarysearch(a,x);
		}

	void binarysearch(int a[],int x)
		{
			int first=0;
			int last=a.length-1;
			int m;
			while(first<=last)
			{
				m=first+(last-first)/2;
				if(a[m]==x)
				{
					System.out.println(m);
					break;
				}
				if(a[m]>x)
				{
					last=m-1;
				}
				if(a[m]<x)
				{
					first=m+1;
				}
			
			}
		//	s.close();
			
			
		}
	}


