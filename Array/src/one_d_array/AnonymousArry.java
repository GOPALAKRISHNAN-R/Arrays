package one_d_array;
/**
 * Simple Java program for AnonymousArray
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/
public class AnonymousArry 
{
	public static void main(String[] args) 
	{
		System.out.println(sum(new int[]{1,6,8,21}));

	}
	static int sum(int[] x)
	{
		int total=0;
		for(int x1:x)
		{
			total=total+x1;
		}
		return total;
	}

}
