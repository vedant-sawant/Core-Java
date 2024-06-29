// import java.util.Scanner;

public class String1 {
    public static void main(String[] args) 
    {
        // Scanner sc=new Scanner(System.in);
        // System.out.print("Please enter Your String: ");
        // String str=sc.nextLine();
        
        // System.out.println(str);

// Logic To Check if a string a string is palindrome?


        String str="vedant";
        int flag=9;
        // System.out.println(str.charAt(1));

        for(int i=0;i<str.length()-1;i++)
        {
            if(str.charAt(i) != str.charAt((str.length()-i)-1))
            {
                System.out.println("Not a Palindrome String");
                flag=1;
               
            }
        }
        if(flag==9)
        {
            System.out.println("String is Palidrome");
        }
    }


}
