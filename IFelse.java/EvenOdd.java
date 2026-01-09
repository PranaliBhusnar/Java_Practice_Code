import java.util.*;
public class EvenOdd{
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     int num= sc.nextInt();
     if(num%2==0){
        System.out.println("Number is Even"+" "+num);
     }  else{
        System.out.println("NUmber is odd"+" "+num);
     }  
    }
}