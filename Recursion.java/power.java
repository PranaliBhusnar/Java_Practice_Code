import java.util.*;
public class power{
    public static int power(int a,int b){
        if(b==1) return a;
        if(b==0) return 1;
        return a*power(a,b-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number");
        int a=sc.nextInt();
          System.out.print("Enter the power number");
        int b=sc.nextInt();
        
        System.out.print("Power is"+ power(a,b));

    }
}