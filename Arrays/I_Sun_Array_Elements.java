public class I_Sun_Array_Elements
{
    public static void main(String[] args) {
        int[] a={3,4};
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=a[i]+sum;
        }
        System.out.println(sum);
    }
}