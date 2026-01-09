import java.util.*;
public class Primenum{
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number");
     int num= sc.nextInt();
     for(int i=2;i<num-1;i++){
        if(num%i==0){
            System.out.println("composite number");
        }
        else{
        System.out.println("Prime number");
        break;
        }
     }
       
    }
}