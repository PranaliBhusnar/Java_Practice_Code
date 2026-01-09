import java.util.*;
public class Sqalpha{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enetr the number");
        int num=sc.nextInt();
        for(int i=65;i<=num;i++){
            for(int j=65;j<=num;j++){
                System.out.print((char)j+" ");
            }
            System.out.print("\n");
        }
    }
}