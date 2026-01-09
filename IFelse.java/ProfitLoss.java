import java.util.*;
public class ProfitLoss{
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter cost price");
     int cp= sc.nextInt();
     System.out.println("Enter selling price");
     int sp= sc.nextInt();
     int profit=sp-cp;
     int loss=cp-sp;
     if(sp-cp>0){
        System.out.println("You made profit of "+ profit);
      }
    else{
        System.out.println("Ooops you loss money "+ loss);
      }
      
    }
}