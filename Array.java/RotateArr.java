import java.util.*;
public class RotateArr{
    public static void reverse(int[] arr, int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enetr the size of array ");
    int n;
    n=sc.nextInt();
    int[] arr=new int[n];
    System.out.println("Enter the numbers in Array");
    int d=3;
    for(int i=0;i<=n-1;i++){
        arr[i]=sc.nextInt();
        // reverse(arr,0,d-1);
        //  reverse(arr,d,n-1);
        //   reverse(arr,0,n-1);
    }
  reverse(arr,0,d-1);
         reverse(arr,d,n-1);
          reverse(arr,0,n-1);
           for(int i=0;i<=n-1;i++){
        System.out.print(arr[i]);
        // reverse(arr,0,d-1);
        //  reverse(arr,d,n-1);
        //   reverse(arr,0,n-1);
    }
    }  
}