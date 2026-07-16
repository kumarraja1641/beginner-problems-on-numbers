import java.util.*;
public class Pronic {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("enter a number");
        int n=sc.nextInt();

        boolean s1=check(n);

        if(s1)
            System.out.println(n+" "+" it is a pronic number" );
        else
            System.out.println(n+" "+"not a pronic number");

    }
    public static boolean check(int n)
    {
        if(n==1)
        return false;

          for(int i=1;i*(i+1)<=n;i++)
          {
            if(i*(i+1)==n)
                return true;
        }


        return false;

    }

    
}
