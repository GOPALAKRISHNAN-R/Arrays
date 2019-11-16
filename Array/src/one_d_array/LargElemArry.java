package one_d_array;

import java.util.Arrays;
/**
 * Simple Java program for Finiding Largest element in an array
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/
public class LargElemArry 
{
	public static void main(String[] args) 
	{
		int a[]={21,190,1,77,250,66};
		System.out.println("Largest element in An Array");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		Arrays.sort(a);
		
		System.out.println("Largest no in an array:"+ a[a.length-1]);
		
		System.out.println("2nd Largest no in an array:"+a[a.length-2]);
		
		System.out.println("Smallest no in an array:"+a[0]);
		
		 System.out.println("2nd Smallest no in an array:"+a[1]);
	}		
}
