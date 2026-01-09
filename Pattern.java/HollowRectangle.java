import java.util.*;
public class HollowRectangle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enetr the number");
        int num=sc.nextInt();
        int m=sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=m;j++){
                 if(i==1|| i==num || j==1 ||j==m){
                    System.out.print("* ");
                 }else{
                    System.out.print("  ");
                 }
            }
            System.out.print("\n");
        } 
    }
}