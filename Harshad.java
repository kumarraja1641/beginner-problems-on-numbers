import java.util.*;
public class Harshad {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("enter a number");
        int n=sc.nextInt();
        boolean s1=check(n);
        if(s1)
        {
            System.out.println(n+" "+ "its harshad number");
        }
        else
        {
            System.out.println(n+" "+" it is not harshad number");
        }
    }

    public static boolean check(int n)
    {
        int k=n;
        int s=0;
        while(n>0)
        {
            int r=n%10;
            s=s+r;
            n=n/10;
        }

        if(k%s==0)
            return true;
        else
            return false;
    }
    
}
