public class array2 {
    public static void main(String[] args) {
        int n=5;
        int[] a=new int[n];
        a[0]=23;
        a[1]=1;
        a[2]=6;
        a[3]=-3;
        a[4]=90;

        int target=3;

        for(int i=0;i<a.length;i++)
        {
            if(a[i]==target)
            {
                System.out.println("Element Found");
                break;
            }
        }

        // Do you need a sorted array for linear search? -> Nope Not at all
    }
}
