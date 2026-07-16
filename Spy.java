import java.util.*;
public class Spy 
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("enter a number ");
        int  n=sc.nextInt();

        boolean s1=check(n);

        if(s1)
            System.out.println(n+" "+ "is a spy number");

        else
            System.out.println(n+" "+ " not a spy number");



    }

    public static boolean check(int n)
    {
        int prod=1,sum=0;

        while(n>0)
        {
            int r=n%10;
            sum=sum+r;
            prod*=r;
            n=n/10;

        }
        if(sum==prod)
        {
            return true;
        }
        else
            return false;
    }
    
}
