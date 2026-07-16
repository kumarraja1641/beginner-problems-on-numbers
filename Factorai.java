import java.util.*;
public class Factorai {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("enter a nuimber");
        int n=sc.nextInt();
        int s=1;

        for(int i=1;i<=n;i++)
        {
            s=s*i;

        }
        System.out.println("factorial of number is"+ " "+ s);
    }
    
}
