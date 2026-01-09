import java.util.*;
public class MissingArr{
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
    int Arrsum=0;
    int sum=n*(n+1)/2;
for(int i=0;i<=n-1;i++){
    Arrsum=Arrsum+arr[i];
    }
   System.out.print(sum-Arrsum);
}
}