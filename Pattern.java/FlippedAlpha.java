import java.util.*;
public class FlippedAlpha{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enetr the number");
        int num=sc.nextInt();
        int a=65;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num+1-i;j++){
                System.out.print((char)a);
                a++;
            }
            System.out.print("\n");
        } 
    }
}