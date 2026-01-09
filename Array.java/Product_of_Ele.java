import java.util.*;
public class Product_of_Ele{
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
    int product=1;
for(int i=0;i<=n-1;i++){
    product=product*arr[i];
    }
    System.out.print("Product of element of array is"+" "+product);
}
}