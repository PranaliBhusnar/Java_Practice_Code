import java.util.*;
public class TwoSum{
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
    int target=4;
for(int i=0;i<=n-1;i++){
   for(int j=i+1;j<=n-1;j++){
        if(arr[i]+arr[j]==target){
        System.out.print(arr[i]+" "+arr[j]);
    }
   }
    }
}
}