/*
    Title: Method Overloading -1 
    Topic: Classes and Methods
    Author: Vedant Sawant
    Date: 05/06/2024
 */

class methodoverload
{
	int add(int a,int b)
	{
		return a+b;
	}
	float add(int a,float b,int c)
	{
		return a+b+c;
	}
	void add(float a,int b,int c)
	{
		System.out.println(a+b+c);
	}
}
class A_Method_Overloading_1
{
	public static void main(String[] args) 
	{
		methodoverload m1=new methodoverload();
		m1.add(22.3f,2,1);
	}
}

 /* OUTPUT 
25.3

 */
 

