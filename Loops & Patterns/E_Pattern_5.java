/*
    Title: Pattern Basics - 2
    Topic: Patterns [Loops]
    Author: Vedant Sawant
    Date: 16/05/2024
	Input:
	n=5
		Output: 
		  * * 
		*     *
		* * * *
		*     *
		*     *
 */

 public class E_Pattern_5
 {
	public static void main(String[] args) 
	{
		int n=8;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if ((j == 0 || j == n - 1) && i != 0 || i == 0 && j > 0 && j < n - 1 || i == n / 2) 
				{
                    System.out.print("*");
                } 
				else 
				{
                    System.out.print(" ");
                }
			}
			System.out.println();
		}
	}
	
 }

 /* OUTPUT 
 
 ****** 
*      *
*      *
*      *
********
*      *
*      *
*      *

 */
 

