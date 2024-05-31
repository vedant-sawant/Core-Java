/*
    Title: Pattern Basics - 2
    Topic: Patterns [Loops]
    Author: Vedant Sawant
    Date: 14/05/2024
	Input:
	n=5
	Output: 
	* * * * *
	*       *
	*       *
	*       *
	* * * * *
 */

 public class A_Pattern_2
 {
	public static void main(String[] args) 
	{
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0 || i==n-1 || j==0 || j==n-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
	}
 }

 /* OUTPUT 
  	* * * * * 
	*       * 
	*       * 
	*       * 
	* * * * *  


 */
 

