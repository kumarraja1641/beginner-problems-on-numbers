import java.util.*;
public class Armstong {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("enter a number");
        int n=sc.nextInt();

        int c=0;
        int temp=n;
        while(n>0)
        {
            c=c+1;
            n=n/10;
        }
        boolean s1=ischeck(temp,c);
        if(s1)
        {
            System.out.println(temp+" "+ "is a armstrong number");
        }
        else
            System.out.println(temp+" "+" not armstrong numbner");
    }
    public static boolean ischeck(int n,int c)
    {

       int temp=n;
       int s=0;

       while(n>0)
       {
        int r=n%10;
        int s1=1;
        for(int i=1;i<=c;i++)
        {
            s1*=r;
        }
        s=s+s1;
        n=n/10;
       }

          if(s==temp)
             return true;
          else
             return false;
    }

    
}
