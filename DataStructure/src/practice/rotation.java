package practice;

import java.util.Scanner;

public class rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



	
				// TODO Auto-generated method stub
				Scanner s=new Scanner(System.in);
				int n=s.nextInt();
				int a[]=new int[100]; 
				for(int i=0;i<n;i++)
				{
					a[i]=s.nextInt();
					
				}
				int first=a[0];
				for(int i=0;i<n;i++)
				{
					
					a[i]=a[i+1];
					
				}
				a[n-1]=first;
				for(int i=0;i<n;i++)
				{
					System.out.println(a[i]);
				}
				s.close();
				

			}

		

	}


