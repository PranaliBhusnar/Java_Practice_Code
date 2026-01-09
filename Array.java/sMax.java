 import java.util.*;
public class sMax{
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
    int max=arr[0];
for(int i=0;i<=n-1;i++){
    if(arr[i]>max){
        max=arr[i];
    }
    }
    System.out.println("Maximum number in array is "+" "+max);
   int smax=arr[0];
    for(int i=0;i<n;i++){
        if(arr[i]>smax && arr[i]!=max){
            smax=arr[i];
        }
    }
      System.out.print("Second Maximum number in array is "+" "+smax); 
}
}