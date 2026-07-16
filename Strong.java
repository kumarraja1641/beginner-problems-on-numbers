import java.util.*;
public class Strong {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("enter a number");
        int n=sc.nextInt();


        boolean s1=isstrong(n);
        if(s1)
        {
            System.out.println(n+" "+ " strong number");
        }
        else
        {
            System.out.println(n+" "+" not a strong number");
        }
    }
    public static boolean isstrong(int n)
    {
        int temp=n;
        int s=0;

        while(n>0)
        {
            int r=n%10;
            int k=fact(r);
            s=s+k;
            n=n/10;
        }
        if(s==temp)
            return true;
        else
            return false;

    }
    public static int fact(int k)
    {
        int fa=1;
        for(int i=1;i<=k;i++)
        {
            fa*=i;
        }
        return fa;

    }
    
}
