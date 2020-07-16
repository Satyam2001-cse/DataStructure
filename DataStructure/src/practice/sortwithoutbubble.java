package practice;

import java.util.Scanner;
//import java.util.Array;
import java.util.Arrays;

public class sortwithoutbubble {

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
Arrays.sort(a);
System.out.println(Arrays.toString(a));

	}

}
