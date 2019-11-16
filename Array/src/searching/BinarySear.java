package searching;

import java.util.Arrays;

/**
 * Simple Java program for Bineary search in an array
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/

public class BinarySear {

	public static void main(String[] args)
	{
		int a[]={12,28,39,1,40,50,60,70};
		
		//unordered elements sort to be ascending order
	
		Arrays.sort(a);
		
		for(int i=0;i<a.length;i++)
		{
		System.out.println("Sort elements are:"+a[i]);
		}
		
		int k=50;
		
		//binary search
		int result=Arrays.binarySearch(a, k);
		
		if(result<0)
		{
			System.out.println("Element not found");
		}
		else
		{
			System.out.println("Element found in index:"+result);
		}
		

	}

}
