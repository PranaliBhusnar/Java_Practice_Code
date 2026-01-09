import java.util.*;
 public class Factorial{
    public static void fact( int num){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.print("Factorial of "+" "+num+ " "+"is"+" "+fact);
    }
    public  static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the  number ");
        int num1=sc.nextInt();
        fact(num1);
 
    } 
 }