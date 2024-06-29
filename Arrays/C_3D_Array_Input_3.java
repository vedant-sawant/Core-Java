/*
    Title: 3D Arrays
    Topic: Use of Scanner Class & Arrays
    Author: Vedant Sawant
    Date: 15/06/2024
*/

import java.util.Scanner;
public class C_3D_Array_Input_3 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int[][][] arr=new int[3][3][2];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                for(int k=0;k<arr[i][j].length;k++)
                {
                    System.out.println(" Enter Class "+i+" Student "+j+" Subject "+k);
                    arr[i][j][k]=sc.nextInt();
                }
            }
        }

        System.out.println("Printing the array....");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                for(int k=0;k<arr[i][j].length;k++)
                {
                    System.out.print(arr[i][j][k]+" ");
                }
            }
            System.out.println();
        }

    }
}
