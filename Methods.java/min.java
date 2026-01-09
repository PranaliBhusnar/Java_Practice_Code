 import java.util.*;
 public class min{
    public  static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the 1st number ");
        double num1=sc.nextDouble();
         System.out.print("Enter the 2nd number ");
        double num2=sc.nextDouble();
        System.out.print("Minimum number is "+Math.min(num1,num2));
    }
 }