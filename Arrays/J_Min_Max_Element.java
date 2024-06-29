import java.util.Scanner;

class newarray
{
    Scanner sc=new Scanner(System.in);
    void take(int[] a)
    {
        System.out.println("Enter Array Elements: ");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
    }

   void display(int[] a)
    {
        System.out.println("You have Entered");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    // 2 1 5 2
    int max(int[] a)
    {
        int max=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];  
            }
        }
        return max;
    }
    int min(int[] a)
    {
        int min=a[0];
        //System.out.println("min starts");
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        return min;
    }
}
public class J_Min_Max_Element {
    public static void main(String[] args) {
        newarray n1=new newarray();
        int n=2;
        int[] arr=new int[n];
        n1.take(arr);
        n1.display(arr);
        System.out.println(n1.min(arr));
        System.out.println(n1.max(arr));
        
    }
}
