import java.util.*;
public class Divisiorofnum {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
       System.out.println("enter a number");
       int n=sc.nextInt();
       List<Integer> l1=new ArrayList<>();

       for(int i=1;i*i<=n;i++)
       {
        if(n%i==0)
        {
            l1.add(i);
        int k=n/i;
        if(k!=i)
            l1.add(k);
           }

       }
            System.out.println(l1);
    }
    
}
