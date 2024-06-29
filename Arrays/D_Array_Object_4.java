
/*
    Title: Arrays
    Topic: Array of Objects
    Author: Vedant Sawant
    Date: 15/06/2024
*/


class Animals
{
    int color;
    String name;
    int age;
}
public class D_Array_Object_4 
{
    public static void main(String[] args) 
    {
        int n=3;
        Animals[] a=new Animals[n];
        
        a[0]=new Animals();
        a[1]=new Animals();
        a[2]=new Animals();

        a[0].color=12;
        a[0].name="Dog";
        a[0].age=5;
    }
}
 