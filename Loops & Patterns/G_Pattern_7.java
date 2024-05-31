/*
    Title: Pattern Basics - 2
    Topic: Patterns [Loops]
    Author: Vedant Sawant
    Date: 30/05/2024
	Input:
	n=5
		Output: 
		***  
		* *
		**
		* *
		***
 */

 public class G_Pattern_7
 {
	public static void main(String[] args) 
	{
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==0 || i==0 && j<(n-1)/2 || i==(n-1)/2 && j<(n-1)/2 || i==(n-1) && j<(n-1)/2 || j==(n-1)/2 && i!=(n-1)/2)
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
		***  
		* *
		**
		* *
		***

 */
 

