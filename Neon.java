import java.util.*;
public class Neon {

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("enter a number");
        int n=sc.nextInt();


        boolean s1=check(n);
        if(s1)
            System.out.println(n+" "+"neon a number");
        else
            System.out.println(n+" "+" is not a neon numnber");

    }

    public static boolean check(int n)
    {
        long k=n*n;
        int s=0;

        while(k>0)
        {
            long r=k%10;
            s=s+ (int) r;
            k=k/10;

        }
        if(s==n)
            return true;
        else
            return false;
    }
}
