import java.util.*;
public class Index{
    public static void Reverse(int[] arr, int i, int d){
       int n=arr.length();
        for(int i=0;i<n/2;i++){
   int temp=arr[i];
   arr[i]=arr[n-1-i];
   arr[n-1-i]=temp;
}
}
    public static void main(String[]args){
//     Scanner sc=new Scanner(System.in);
//     System.out.print("Enetr the size of array ");
//     int n;
//     n=sc.nextInt();
//     int[] arr=new int[n];
//     System.out.println("Enter the numbers in Array");
//     for(int i=0;i<=n-1;i++){
//         arr[i]=sc.nextInt();
//     }
// for(int i=0;i<=n-1;i++){
//     if(i%2==0){
//         arr[i]=arr[i]+10;
//     }
//     else{
//         arr[i]=arr[i]*2;
//     }
//     }
//     for(int i=0;i<=n-1;i++){
//      System.out.print(arr[i]+" ");
//     }
// Scanner sc=new Scanner(System.in);
// int n=sc.nextInt();
// int [] arr= new int[n];
// for(int i=0;i<n;i++){
//     arr[i]=sc.nextInt();
// }
//  int min=0;
// for(int i=1;i<n;i++){
//     if(arr[i]>arr[min]){
//         min=i;
//     }
// }
// System.out.print(arr[min]);
Scanner sc=new Scanner(System.in);
System.out.print("Enter the size of array");
int n=sc.nextInt();
int[] arr=new int[n];
System.out.print("enter the element of array");
for(int i=0;i<n;i++) arr[i]=sc.nextInt();
int d=3;
int i=0,n=arr.length();
 Reverse(arr,i,n/2
 );
for(int i=0;i<n;i++) System.out.print(arr[i]+" ");
System.out.println(" ");
 

 for(int i=0;i<n;i++) System.out.print(arr[i]+" ");
// int max=0,smax=0;
// for(int i=1;i<n;i++){
//     if(arr[max]<arr[i] ){
//      max=i;
//     }  
// }

// for(int i=1;i<n;i++){
//      if(i!=max){
//         if(arr[i]>arr[smax]){
//             smax=i;
//         }
//      }
// }
// System.out.print("Max ele "+arr[max]+" Smax ele is"+arr[smax]);
//  int k=6;
// int j=1,i=0;
  
//    for(i=0;i<n;i++){
//     for(j=i+1;j<n;j++){
//         if(arr[i]+arr[j]==k) {
//              System.out.println("Index of Element is "+ i +" and "+ j);
//             break;
//         }
//     }
//    }
 

//  print(arr);
// for(int i=0;i<n;i++) {
//     if(i%2==0) System.out.print(arr[i]+10+" ");
//     if(i%2!=0) System.out.print(arr[i]*2+" ");
// }
// System.out.print("\n");
//  print(arr);
 //  boolean flag=false;
// for(int i=0;i<n;i++){
//     if(arr[i]==k) flag=true;
// }
// if(flag==true) System.out.print("Element is present in the array "+k);
// else System.out.print("element is not present in the array");
// Arrays.sort(arr);
// print(arr);
// int sum=0;
// for(int i=0;i<n;i++) sum=sum+arr[i];
// System.out.print("sum of array's element is"+sum);
 
//  int max=0;
//  for(int i=0;i<n;i++) {
// if(arr[max]<arr[i]){
//     max=i;
// }
// }
// System.out.print("Maximum element in the array is "+arr[max]);
// String[] arr={"Pranali","Lili","Abc"};
// for(int i=0;i<arr.length;i++){
//     System.out.println(arr[i]+" ");
// }
}
// public static void print(int[] arr){
//     for(int i=0;i<arr.length;i++){
//         System.out.print(arr[i]+" ");
//     }
//     System.out.print("\n");
// }
}