/*
    Title: Method Overloading -3
    Topic: Classes and Methods
    Author: Vedant Sawant
    Date: 05/06/2024
 */

class C_Main_Method_Overloading_4
{
    public static void main(String[] args) {
        System.out.println("This is actual main method");
    }
    public static void main(int a) {
        System.out.println("This isnt a ");
    }
    public static void main(float g) {
        System.out.println("This one wont execute");
        
    }
}
/*
 OUTPUT
This is actual main method
 */