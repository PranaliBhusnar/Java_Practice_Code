import java.util.*;
 public class Combination{
    public static void fact( int num1,int num2){
        int fact=1;
        int nfact,rfact,nfactr;
        int nrfact;
        for(int i=1;i<=num1;i++){
            nfact=fact*i;
        }
        System.out.println("Factorial of "+" "+num1+ " "+"is"+" "+nfact);
         for(int i=1;i<=num2;i++){
            rfact=fact*i;
        } System.out.println("Factorial of "+" "+num2+ " "+"is"+" "+rfact);
        for(int i=1;i<=num1-num2;i++){
            nrfact=fact*i;
        } int num=num1-num2;
        System.out.println("Factorial of "+" "+ num+ " "+"is"+" "+nrfact);
        nfactr=nfact/(rfact*nrfact);
         System.out.println("Combination of "+" "+num1+"and"+" "+num2+" "+"is"+" "+nfactr);
    }
    
    public  static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st the  number ");
        int num1=sc.nextInt();
         System.out.print("Enter the 2nd  number ");
        int num2=sc.nextInt();
        fact(num1,num2);
 
    } 
 }