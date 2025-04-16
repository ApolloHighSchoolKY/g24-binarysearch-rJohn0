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
				//dont know how this works, i kind of just remembered you saying something about this and it made my code work so
				bottom = middle+1; 
			}
			if(ray[middle] > item)
			{
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
