/*
    
    2,4,2,2,4,2   target=2
    first occurance: 0
    return last occurance: 5


*/


public class array3
{
    public static void main(String[] args) 
    {
        int target=2;
        int[] a={2,4,2,2,4,2};
        //int temp=0;
        int count=1;
        
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==target)
            {
                count++;
            }
        }
        System.out.println(count);
        //System.out.println(" The element yoou are searching for is "+temp+" times in the array");
    }
}
