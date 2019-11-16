package two_d_array;

import java.util.Scanner;

/**
 * Simple Java program for addition operation on 2D-Array
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/
 
public class AddTwoArry
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		int a[][]=new int[4][4];
		int b[][]=new int[4][4];
		int c[][]=new int[4][4];
		int d[][]=new int[4][4];
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter A array elements:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter B array elements:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Addition of A and B Array:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println(c[i][j]);
			}
		}
		
		System.out.println("Subtraction of A and B Array:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				d[i][j]=a[i][j]-b[i][j];
			}
		}
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println(d[i][j]);
			}
		}
	}
}
