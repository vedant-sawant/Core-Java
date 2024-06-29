/*
    Title: Input in Java
    Topic: Use of Scanner Class
    Author: Vedant Sawant
    Date: 14/06/2024
	Input:
	abcs
	Output: 
	abcs
 */
import java.util.Scanner;
public class B_Input_in_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ac=sc.nextLine();
        System.out.println("You entered Line "+ac);
    }
}
/*
Output: 
abcs
*/