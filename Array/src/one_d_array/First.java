package one_d_array;

import java.util.Scanner;

/**
 * Simple Java program for 1D Array Declaration,Initialization
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/
 
public class First
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		int n;
		//new keyword to create memory
		int a[]=new int[2];
		
		//directly initialize value to an array
		int b[]={19,21,21,25,100,21};
		
				
		//getting n value based on number of values to be stored in an array
		int c[]=new int[20];
		System.out.println("Enter no. of value to be stored to an array C:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		System.out.println("Enter values to be stored:");
		for(int i=0;i<n;i++)
		{
			c[i]=sc.nextInt();
		}
		
		a[0]=1;
		a[1]=10;
		
		System.out.println("Array A contains Element are:");
		for(int i=0;i<2;i++)
		{
			System.out.println(a[i]);
		
		}
		
		System.out.println("Array B contain Elements are:");		
		for(int i=0;i<5;i++)
		{
		
			System.out.println(b[i]);
		}
		
		System.out.println("Array C contains Elements:");
		for(int i=0;i<n;i++)
		{
			System.out.println(c[i]);
		}
	}

}
