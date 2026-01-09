import java.util.*;
public class factorial{
    public static int fact(int n){
        if(n==0) return 1;
        int f=fact(n-1)*n;
        return f;
    }
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int Factorial=fact(n);
System.out.print(Factorial+" ");
    }
}