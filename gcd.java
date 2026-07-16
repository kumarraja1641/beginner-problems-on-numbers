import java.util.*;
public class gcd {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("enter a 2 numbers");
        int n1=sc.nextInt();
        int n2=sc.nextInt();

        int k=gcdof(n1,n2);
        System.out.println(k);
    }
   /*  public static int gcdof(int n1,int n2)
    {
        int min1=Math.min(n1,n2);

        for(int i=min1;i>=1;i--)
        {
            if(n1%i==0 && n2%i==0)
                return i;
        }
         return 1;
    }
         */

    public static int gcdof(int n1,int n2)
    {
        while(n1!=0 && n2!=0)
        {
            if(n1>n2)
                n1=n1%n2;
            else
                n2=n2%n1;
        }
        if(n1==0)
            return n2;
        else
            return n1;
    }
   
    
}
