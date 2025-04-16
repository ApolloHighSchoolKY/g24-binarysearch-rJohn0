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
			
			if(ray[middle] > item)
			{
				top = middle;
			}
			if(ray[middle] < item)
			{
				bottom = middle; 
			}
			if(ray[middle] == item)
			{
				return middle;
			}
			
		}
		return -1;
	}
}
