public class STring2 {
    public static void main(String[] args) {
        String str1="vedant";
        String str2="vedant";
        String str3=new String("vedant");
        //case 1
        //checking str1 with str2 using ==
        if(str1.equals(str2))
        {
            System.out.println("Both str1 and str2 are equal");
        }
        else
        {
            System.out.println("Ummm, Sorry str1 and str2 are not equal");
        }

        //case 2
        //checking str1 and str3 using ==
        if(str1.equals(str3))
        {
            System.out.println("Both str1 and str3 are equal");
        }
        else
        {            
            System.out.println("Ummm, Sorry str1 and str3 are not equal");
        }

    }
}
