import java.util.*;
public class Sumdigit{
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     int num= sc.nextInt();
       int sum=0, count=0;
       while(num!=0){
       num=num%10;
        count=count+num;
        
        sum=sum+count;
       }System.out.println(count);
       System.out.print(sum);
}}