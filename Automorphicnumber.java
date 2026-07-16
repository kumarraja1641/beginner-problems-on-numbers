import java.util.*;
public class Automorphicnumber {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("enter a number");
        int n=sc.nextInt();

        boolean s1=check(n);
        if(s1)
        {
            System.out.println(n+" "+ " is a automorphicnumber");
        }
        else
            System.out.println("not a automorphic number");

    }
   public static boolean check(int n)
   {
    int sq=n*n;
    int k=String.valueOf(n).length();
    int i=0;

    while(sq>0)
    {
        int r1=sq%10;
        int r2=n%10;

        if(r1!=r2)
            return false;



        n=n/10;
        sq=sq/10;
        i++;

        if(i==k)
            break;

        /*
         if((sq % 10) != (temp % 10))
            return false;

          n=n/10;
        sq=sq/10;

        
        
        */

        

    }
    return true;

    
   }
    
}
