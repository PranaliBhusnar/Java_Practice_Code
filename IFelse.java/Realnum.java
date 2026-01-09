import java.util.*;
public class Realnum{
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
    double num= sc.nextDouble();
    int x=(int)num;
    if(num-x>0){ System.out.println("Not an integer");}
    else{ System.out.println("Integer ");}
      
    }
}