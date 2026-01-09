import java.util.*;
public class StarPlus{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enetr the number");
        int num=sc.nextInt();
         if (num % 2 == 0) {
            System.out.println("For a better visual, an odd number is recommended. Adjusting size to " + (size + 1));
            num++;
        }
        int mid=num/2;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(j==mid || i==mid){
                    System.out.print("*");
                }
                else{
                    System.out.print("#");
                }
            }
            System.out.print("\n");
        } 
    }
}