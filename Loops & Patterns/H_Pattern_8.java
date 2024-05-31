/*
    Title: Pattern Basics - 2
    Topic: Patterns [Loops]
    Author: Vedant Sawant
    Date: 31/05/2024
	Input:
	n=5
		Output: 
*
**
***
****
 */

 public class H_Pattern_8
 {
	public static void main(String[] args) 
	{
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
 }

 /* OUTPUT 
*
**
***
****

 */
 

