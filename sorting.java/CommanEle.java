import java.util.*;
public class CommanEle{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size of array");
        int n=sc.nextInt();
        System.out.print("Enter the ele of 2nd array");
        int[] arr1=new int[n];
         int[] arr2=new int[n];
         int[] arr3;
         int m=arr3.length;
           arr3=new int[m];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
         if(arr1[i]==arr2[j]){
        
        arr3[i]=arr2[j];
        
         }   
             }
        }
         while(m>=0){
            System.out.print(arr3[m]+" ");
            m--;
         }
    }
}