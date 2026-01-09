import java.util.*;
public class Alphannum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enetr the number");
        int num=sc.nextInt();
        int a=65;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
              if(j%2==0){
                System.out.print((char)a);
                a++;
              }
              else{
                System.out.print(j);
              }
            }
            System.out.print("\n");
        }
    }
}