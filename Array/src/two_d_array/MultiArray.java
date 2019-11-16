package two_d_array;

import java.util.Scanner;

/**
 * Simple Java program for Multi-D-Array
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/
 
public class MultiArray
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		int a[][]=new int[4][4];
		int b[][]=new int[4][4];
		int c[][]=new int[4][4];
		int k;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter A array elements:");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter B array elements:");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
				
		
		System.out.println("Multiplication of Matrix:");
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{	
				for(k=0;k<2;k++)
				{
				c[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{

				System.out.println(c[i][j]);
			
			}
		}
		

	}

}
