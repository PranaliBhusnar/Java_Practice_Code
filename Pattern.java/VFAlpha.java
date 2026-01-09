import java.util.*;
public class VFAlpha{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enetr the number");
        int num=sc.nextInt();
        for(int i=65;i<=num;i++){
            for(int j=1;j<=num+1-i;j++){
                System.out.print(" ");
            }
            for(int k=65;k<=i;k++){
                System.out.print((char)k);
            }
            System.out.print("\n");
        }
    }
}