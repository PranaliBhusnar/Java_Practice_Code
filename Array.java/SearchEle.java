import java.util.*;
public class SearchEle{
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
    int key=6;
    boolean flag=false;
    for(int i=0;i<=n-1;i++){
    if(arr[i]==key){ 
        flag=true;
        break;
    }
    }
    if(flag==true){
        System.out.print("Key is present in array");
    }
    else{
        System.out.print("Key is not present in Array");
    }
     
}
}