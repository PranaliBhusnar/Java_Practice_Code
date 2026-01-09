import java.util.*;
public class Negativenum{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enetr the size of array ");
    // int num =sc.nextInt();
    int n;
    int[] arr=new int[n];
    // int n =arr.length;
    System.out.println("Enter the numbers in Array");
    for(int i=0;i<=n-1;i++){
        // System.out.print(arr[i]+" ");
        arr[i]=sc.nextInt();
    }
    System.out.println("Number in array");
for(int i=0;i<=n-1;i++){
    if(arr[i]<0){
        System.out.print(arr[i]+" ");}
        // arr[i]=sc.nextInt();
    }

    }
}