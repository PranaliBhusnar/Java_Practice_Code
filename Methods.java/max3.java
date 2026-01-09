import java.util.*;
 public class max3{
    public  static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the 1st number ");
        double num1=sc.nextDouble();
         System.out.print("Enter the 2nd number ");
        double num2=sc.nextDouble();
        System.out.print("Enter the 3rd number ");
        double num3=sc.nextDouble();
        double max=Math.max(Math.max(num1,num2),num3);
        System.out.print("Maxmum number is "+ max);
    }
 }