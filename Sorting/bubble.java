public class bubble {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22};

        int a=0;
        for (int i = 0; i < arr.length - 1; i++) 
        {
            for(int j=1;j<arr.length-1;j++)
            {
                if(arr[j]<arr[i])
                {
                    a=arr[i];
                    arr[i]=arr[j];
                    arr[j]=a;
                }
        }
    }
}
