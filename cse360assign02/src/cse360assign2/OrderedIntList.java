/*	CSE360 assign2
 * 	Author: Shahad Hummusani
 *  PIN: 27
 *  Description: The program implements a list as an array of integer and inserts a new value into the array so that the array remains in ascending order 
 *  after that it prints the list in ascending order 5 integers per line, each separated by a tab.
 */
package cse360assign2;
/*
 * @author Shahad Hummusani
 */
public class OrderedIntList 
{
	protected int[] array;  //array
	protected int count; 	 //counter
	private boolean debug = true;
	
	/*
	 * class constructor
	 */
	OrderedIntList()
	{
		array = new int[10];
	}
	
	/*
	 *The method is used to insert an integer to the array in ascending order
	 * @param value
	 * @return no return value
	 */
	public void insert(int value) 
	{
		if(debug)
			System.out.print("Debug (value) :"+ value + " ");
		
		if( count == array.length )
			grow(); 
		else if (count == 0) 
		{
			array[0] = value;    
			count = count + 1;	 
		}
		else 
		{
			int insertIndex = 0;
			int index = 0;	
			boolean done = false;
			
			while( !done && index < count)
			{	
				if( value < array[index] ) 
					done = true;
				
				else
					
					insertIndex = insertIndex + 1;
					
				index = index + 1;
			}
			
			for ( index = count ; index > insertIndex ; index--) 
						array[index] = array[index - 1];		
			
			array[insertIndex] = value; 
			count = count + 1;
		}
		
		if(debug)
		{
			System.out.print("Debug (count) :" + count);
			System.out.println();
		}
	}
	
	/*
	 * Grow method is used to expand the array when more than 10 elements are inserted
	 * @param no parameter
	 * @return no return value
	 */
	private void grow()
	{
		int[] temp = new int[count * 2];
			
		for (int index = 0; index < count; index++ )
			temp[index] = array[index];
			
		array = temp;
	}
	
	/*
	 * prints the list in ascending order, 5 per line 
	 * @param no parameter
	 * @return no return value
	 */
	public void print () 
	{
		for (int index = 0 ; index < count ; index ++) 
		{
			if (index % 5 == 0) 
				System.out.println();	
				
			System.out.print(array[index] + "\t");
		}
		System.out.println();
	}	

}
