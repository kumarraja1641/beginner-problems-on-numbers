import java.util.*;
public class Perfect {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("enter a number");
        int n=sc.nextInt();

        boolean is=pfect(n);
        if(is)
            System.out.println(n +" "+ "is a perfect number");
        else
            System.out.println("not perfect numbr");
    }
    public static boolean pfect(int n)
    {
        int c=1;
       /*  for(int i=1;i<n;i++)
        {
            if(n%i==0)
                c=c+i;

            if(c>n)
                return false;
        }
        if(c==n)
            return true;
        else
            return false;
        */


        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                c=c+i;
                int k=n/i;
                if(k!=i)
                    c=c+k;
            }
           
        }
        if(c==n)
            return true;
        else
            return false;
    }
}
