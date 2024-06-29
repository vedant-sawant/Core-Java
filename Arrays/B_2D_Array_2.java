/*
    Title: 2D Arrays
    Topic: Use of Scanner Class & Arrays
    Author: Vedant Sawant
    Date: 14/06/2024
	Input & Output:
    Enter Marks of Class 0Student 0
    1
    Enter Marks of Class 0Student 1
    2
    Enter Marks of Class 0Student 2
    3
    Enter Marks of Class 1Student 0
    4
    Enter Marks of Class 1Student 1
    5
    Enter Marks of Class 1Student 2
    6
    Enter Marks of Class 2Student 0
    7
    Enter Marks of Class 2Student 1
    8
    Enter Marks of Class 2Student 2
    9
    Enter Marks of Class 3Student 0
    10
    Enter Marks of Class 3Student 1
    11
    Enter Marks of Class 3Student 2
    12
    1 2 3
    4 5 6
    7 8 9
    10 11 12
 */
import java.util.Scanner;
public class B_2D_Array_2 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[4][3];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.println(" Enter Marks of Class "+i+ "Student "+j);
                arr[i][j]=sc.nextInt();
            }
        }    
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j] + " ");
                //System.out.println("Marks of Class "+arr[i]+" Student: "+arr[j]);
            }
            System.out.println();
        }
    }    
}
