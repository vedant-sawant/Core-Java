/*
    Title: Arrays
    Topic: Use of Scanner Class & Arrays
    Author: Vedant Sawant
    Date: 14/06/2024
	Input:
	How many Elements You Want to Enter: 
    3
	Output: 
	How many Elements You Want to Enter: 
    3
    Enter Array ELements:
    2
    5
    7
    Displaying Elements:
    2
    5
    7   
 */

import java.util.Scanner;
class arrays
{
    Scanner sc=new Scanner(System.in);
        void arrayinput()
    {
        System.out.println("How many Elements You Want to Enter: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter Array ELements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Displaying Elements: ");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
   
}
public class A_Array_Input_1 
{

    public static void main(String[] args) 
    {
        
          arrays a=new arrays();
          a.arrayinput();
    }
}
/*
 
 Output: 
	How many Elements You Want to Enter: 
    3
    Enter Array ELements:
    2
    5
    7
    Displaying Elements:
    2
    5 
    7    
 */