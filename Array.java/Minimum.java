import java.util.*;
public class Minimum{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enetr the size of array ");
    int n;
    n=sc.nextInt();
    int[] arr=new int[n];
    System.out.println("Enter the numbers in Array");
    for(int i=0;i<=n-1;i++){
        arr[i]=sc.nextInt();
    }
     int min=arr[0];
for(int i=0;i<=n-1;i++){
    if(min>arr[i]){
        min=arr[i];
    }
    }
    System.out.print("Minimum number in array is"+" "+min);
}
}