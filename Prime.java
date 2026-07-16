import java.util.*;
public class Prime
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("enter a number");

        int n=sc.nextInt();
        

        boolean s1=isprime(n);
        if(s1)
        {
            System.out.println(n +" is " + "prime number");
        }
        else
            System.out.println(n+"  is"+"not prime number");

    }

    public static boolean isprime(int n)
    {
        if(n<=0 || n==1)
            return false;
        if(n==2 ||n==3)
            return true;
        int c=0;

        boolean k1=true;

        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                return false;
            }

            
        }
       return true;

    }
}