import java.util.*;
public class AbsoluteValue{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int num=sc.nextInt();
       if(num>0){
        System.out.println(num);
       }
       else{ 
        num=-num;
        System.out.println(num);
       }
    }
}