public class binary {
    public static void main(String[] args) {
        int num[]={-1,3,6,8,9,11};
        int target=3;
        int low=0;
        int high=num.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;

            if(num[mid]==target)
            {
                System.out.println(mid);
                break;
            }
            if(target>num[mid])
            {
                low=mid+1;
            }
            if(target<num[mid])
            {
                high=mid-1;
            }
        }
    }
}
