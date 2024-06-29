import java.util.Scanner;

// In a java file can there be more than 1 public classes?  -> NOpe 
public class moutain 
{
    // public static int peak()
    // {

    // }
    // public static int binary()
    // {

    // }
    public static void main(String[] args) 
    {
        System.out.println("Helllo ALl");    
        Scanner sc=new Scanner(System.in);

        //taking array length from user
        System.out.println("What should be array length?? ");
        int n=sc.nextInt();
        int[] arr=new int[n];

        //taking array elements from user
        System.out.println(" Enter array Elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }


        //printing array elemnents
        for(int i=0;i<n;i++)
        {
           System.out.print(arr[i]+" ");
        }

        //take user input for target
        System.out.println("Enter Target: ");
        int target=sc.nextInt();

        //login starts
        int peak=peak_element(arr);
        System.out.println("The Peak Element is: " +peak);
        int result=firsthalf(0,peak,arr,target);
        System.out.println("Element found in first half: "+result); //-1 element is not found in first half
        int result2=0;
        if(result==-1)
        {
            
            //find in second half
            result2=secondhalf(arr.length-1,peak+1,arr,target);
        }
        System.out.println("Element found in second half: "+result2); //-1 element not found

        if(result==-1)
        {
            System.out.println("Ughhh The element is not in this array");
        }
    }
    public static int secondhalf(int low,int high,int arr[],int target)
    {
        while(high<=low)
        {
            int mid=(low+high)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(target>arr[mid])
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return -1;
    }
    public static int firsthalf(int low,int high,int arr[],int target)
    {
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(target==arr[mid])
            {
                return mid;
            }
            else if(target>arr[mid])
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return -1;
    }
    public static int peak_element(int arr[])
    {
        //System.out.println("It is in peakelement");
        int low=0;
        int high=arr.length-1;

        while(low<=high)
        {
            int mid=(low+high)/2;

            //write peak element 3 conditions
            if(low==high)
            {
                return arr[low];
            }
            else if(arr[mid]>arr[mid+1])
            {
                high=mid;
            }
            else if(arr[mid]<arr[mid+1])
            {
                low=mid+1;
            }
          
        }
        return -1;
    }
}
