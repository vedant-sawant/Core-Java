/*
Home work For Today :)
   Declare/Make a class Animal. Take User Input for different animals(objects) 
   then you print the animals and there entites(variables [age, colour, legs])
 */
/*
1. Will this program run???
->>> Yes

2. what is a b and c ??? 
->>> Local Variable

3. Where c will be stored??
->>>>> Stack Area



*/
class abc
{
   int color;
   int a;
   String name;
}
class test
{
    public static void main(String[] args) 
    {
       abc[] a=new abc[5];
       a[0]=new abc();
       a[1]=new abc();
       a[2]=new abc();

       a[0].color=12;
       System.out.println(a[0]);


    }
}