/*
    Title: Method Overloading -2
    Topic: Classes and Methods
    Author: Vedant Sawant
    Date: 05/06/2024
 */

 class bagha
 {
     void displ()
     {
        System.out.println("Hey");
     }
     String displ(String name)
     {
        return name;
     }
     void displ(int a)
     {
        System.out.println(a);
     }
 }
 class B_Method_Overloading_2
 {
     public static void main(String[] args) 
     {
        bagha m1=new bagha();
         m1.displ();
         m1.displ(23);
         System.out.println(m1.displ("Vedant"));
     }
 }
 /*
  OUTPUT
  Hey
23
Vedant
  */
 

  
 
 