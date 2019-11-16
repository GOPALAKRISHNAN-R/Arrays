package one_d_array;

import java.util.Scanner;

/**
 * Simple Java program for displays ODD or Even Numbers in an array
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/
 
public class OddREven 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		int a[]=new int[10];
		int n,t;
		
		System.out.println("Enter number of values to be stored:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		System.out.println("Enter "+n+" Values:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
						
		System.out.println("Stored elements in an array:");
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				if(a[i]>a[j])
				{
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("Even Elements in an Array:");
		for(int i=0;i<n;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
		
		System.out.println("Odd Elements in an Array:");
		for(int i=0;i<n;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
			}
		}

	}

}
