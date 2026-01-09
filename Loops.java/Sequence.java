import java.util.*;
public class Sequence {
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     int num= sc.nextInt();
     int a=1;
      for(int i=1;i<20;i++){
        if(i%2==0){
            System.out.println(num);
            num--;
        }
        else{
            System.out.println(a);
            a++;
        }
      } 
    }
}