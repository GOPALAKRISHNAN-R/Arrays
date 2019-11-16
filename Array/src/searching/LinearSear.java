package searching;

import java.util.Scanner;
/**
 * Simple Java program for LinearSearch in an array
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/
public class LinearSear 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		int a[]=new int[20];
		int n,s;
		
		System.out.println("LINEAR SEARCH");
		System.out.println("~~~~~~~~~~~~~");
		
		System.out.println("Enter number of value to be store to an array:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		System.out.println("Enter "+n+" Elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();			
		}
		
		System.out.println("Enter the value to be search:");
		s=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			if(a[i]==s)
			{
				System.out.println("Element "+s+" is Found at the index position "+i);
			}
		}
		
	}
}


