/*	CSE360assign2
 * 	Author: Shahad Hummusani
 *  PIN: 27
 *  Description: The class Analytics is a subclass for OrderedIntList. It has five public methods which are: mean, median, high, low, numInts.
 */

package cse360assign2;

public class Analytics extends OrderedIntList
{	
	/*
	 * returns the mean of an integer list as a double
	 * @param none
	 * @return mean
	 */
	public double mean()
	{
		double sum = 0.0;
		double mean = 0.0;
		
		if (array == null)
			return -1;
		else
		{
			for (int index = 0 ; index < count ; index++ )
				sum = sum + array[index];
			
			mean = sum / count;
			return mean;
		}	
	}
	
	/*
	 * returns the median of the integer list as an integer
	 * @param none
	 * @return none
	 */
	public int median()
	{
		int middle = count / 2;
		if (array == null)
			return -1;
		else if ( count % 2 != 0 )
			return array[middle];
		else
			return ( array[middle - 1] + array[middle] ) / 2;
	}
	/*
	 * returns the high value in the list.
	 * @param none
	 * @return none
	 */
	public int high()
	{
		if ( array == null)
			return -1;
		
		return array[count - 1];
	}
	/*
	 * returns the low value in the list.
	 * @param none
	 * @return none
	 */
	public int low()
	{
		if ( array == null)
			return -1;
		
		return array[0];
	}
	/*
	 * returns the number of integers in the list
	 * @param none
	 * @return none
	 */
	public int numInts()
	{
		return count;
	}

}
