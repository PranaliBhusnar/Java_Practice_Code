import java.util.*;
 public class pow{
    public  static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the base number number ");
        double num1=sc.nextDouble();
         System.out.print("Enter the power number ");
        double num2=sc.nextDouble();
        System.out.print("Power of number is "+Math.pow(num1,num2));
    }
 }