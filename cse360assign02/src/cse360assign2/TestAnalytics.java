/*	CSE360assign2
 * 	Author: Shahad Hummusani
 *  PIN: 27
 *  Description: The class AnalyticsTest is a subclass for OrderedIntList. It test all of the five public methods 
 *  in the Analytics which are: mean, median, high, low, numInts.
 */
package cse360assign2;
/*
 * @author Shahad Hummusani
 */

public class TestAnalytics extends OrderedIntList 
{
	public static void main(String [] args)
	{	
		Analytics analytics = new Analytics();
		
		// the array holds integers from 1 to 20
		int array[] = {19,17,6,3,20,11,8,1,13,4,34,9,10,2,15,12,5,7,14,16,18}; 
		
		for ( int index = 0 ; index < array.length ; index++ )
			analytics.insert(array[index]);
		
		// printing the array by calling print()
		System.out.print("\n" + "The sorted array: ");
		analytics.print();
		
		// Testing all the methods in Analytics class
		System.out.println("\n" + "Mean: " + analytics.mean() );
		System.out.println("Median: " + analytics.median() );
		System.out.println("Low value: " + analytics.low() );
		System.out.println("high value: " + analytics.high() );
		System.out.println("number of integers: " + analytics.numInts() );
	}
}
