import java.util.*;
public class Sqnum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enetr the number");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}