package one_d_array;

/**
 * Simple Java program for sorting an Array elements
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/
public class Sort
{
	public static void main(String[] args) 
	{
		int t;
		int a[]={12,16,2,10};
		System.out.println("Before sorting:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("After Sorting:");
		
		//Arrays.sort(a);
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					t=a[i];
					a[i]=a[j];
					a[j]=t;
					
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
