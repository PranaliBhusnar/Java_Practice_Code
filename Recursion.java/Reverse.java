import java.util.*;
public class Reverse{
    public static void main(string[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextint();
        int r=0;
        while(n>0){
         r=r*10;
         r=r+(n%10);
         n=n/10;
        }
        System.out.print(r);
    }
}