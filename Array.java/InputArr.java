import java.util.*;
public class InputArr{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enetr the number");
    // int num =sc.nextInt();
    int[] arr=new int[5];
    // int n =arr.length;
    for(int i=0;i<=4;i++){
        // System.out.print(arr[i]+" ");
        arr[i]=sc.nextInt();
    }
    System.out.println("Number in array");
for(int i=0;i<=4;i++){
        System.out.print(arr[i]+" ");
        // arr[i]=sc.nextInt();
    }

    }
}