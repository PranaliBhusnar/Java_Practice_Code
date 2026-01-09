import java.util.*;
public class LogoPower{
     public static int power(int a,int b){
        if(b==1) return a;
        if(b==0) return 1;
        int call=power(a,b/2);
        if(b%2==0) return call*call;
         else return a*call*call;
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