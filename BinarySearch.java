import java.util.Arrays;

public class BinarySearch
{
	public static int binarySearch(int[] ray, int item)
	{
		Arrays.sort(ray);
		int top = ray.length-1;
		int bottom = ray[0];
		int middle =0;
	
		while (bottom < top) 
		{
			middle = (top + bottom) / 2;
			
			if(ray[middle] < item)
			{
				//dont know how the +1 works, i kind of just remembered you saying something about this and it made my code work so
				// im assuming it makes it more efficient or soemthing
				bottom = middle+1; 
			}
			if(ray[middle] > item)
			{
				//same as other comment 
				top = middle-1;
			}
			
			if(ray[middle] == item)
			{
				return middle;
			}
		}
		return -1;
	}
}
