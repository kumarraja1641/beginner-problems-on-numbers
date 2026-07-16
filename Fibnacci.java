import java.util.*;
public class Fibnacci {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("enter a number to that greater than 2 ");

        int n=sc.nextInt();

        int a=0,b=1;
        System.out.print(a+" "+b+" ");

        for(int i=2;i<n;i++)
        {
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }

    }

    
}
