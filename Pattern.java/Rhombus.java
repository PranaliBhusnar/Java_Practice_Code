import java.util.*;
public class Rhombus{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enetr the number");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num-i;j++){
                System.out.print(" "+" ");
            }
             
            for(int l=1;l<=num;l++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
         
    }
}