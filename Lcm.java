import java.util.*;
public class Lcm {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("enter a 2 numbers");
        int n1=sc.nextInt();
        int n2=sc.nextInt();

        int mx=Math.max(n1,n2);

        int i=1;
        while(true)
        {
            if(mx%n1==0 && mx%n2==0)
            {

             System.out.println(mx);
            break;
            }
            i++;
            mx=mx*i;

        }

    }
}
