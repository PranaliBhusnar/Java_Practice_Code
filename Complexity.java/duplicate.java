 import java.util.*;
 public class duplicate{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size of Array");
    int n=sc.nextInt();
    int[] arr=new int[n];
    System.out.print("Enter the element in the Array");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    boolean floar;
    int a,b;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]==arr[j]){
           
           System.out.print(arr[i]+" ");
           break;
            }
        }
    }
//     if(a==1){
// System.out.print(b);
//     }

    }
}