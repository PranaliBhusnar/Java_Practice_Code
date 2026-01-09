 import java.util.*;
 public class Squarenum{
    public static void main(String[] args){
       System.out.println("Enter the number");
       Scanner sc=new Scanner(System.in);
       double num=sc.nextDouble();
       double sq=num*num;
       System.out.println("Square of"+" "+ num +" "+"is"+sq); 
    }
}