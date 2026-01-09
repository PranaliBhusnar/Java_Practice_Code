import java.util.*;
public class Diamond{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enetr the number");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num-i;j++){
                System.out.print(" ");
            }
            for(int l=1;l<=2*i-1;l++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for(int i=1;i<=num-1;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=5;k>0;k=k-1){
                System.out.print("*");
            }
            System.out.print("\n");
        }
         
    }
}