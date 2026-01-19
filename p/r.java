import java.util.*;
public class r{
    // static String g(){
    //     System.out.println("Hello Pranali");
    //     String r="hi";
    //     return r;
    //     System.out.println("Hello Pranali");
    // }
    // static int num(int num){
    //     return num;
    //     System.out.println("Hello Pranali");
    // }
     public static void main(String[] args){
    //     System.out.println("Hello Pranali");
    //     g();
    //     num(5);
    // }
    //   int [][] arr= new int[3][3];
    // System.out.println(arr[1]);
   // String [] arr= new String[5];
    // System.out.println(arr[1]);
    Scanner sc= new Scanner(System.in);
    // for(int ele:arr){
    //     System.out.println("Enter "+ele);
    //     arr[ele]=sc.nextInt();
    //     ele++;
    // }
    // for(int ele:arr){
    //     System.out.println( arr[ele]);
         
    // }
    // for(int i=0;i<arr.length;i++){
    //     for(int j=0;j<arr[0].length;j++)
    //     arr[i][j]=sc.nextInt();
    // }
    //  for(int i=arr.length-1;i>=0;i--){
    //      System.out.println( arr[i]);
    // }
//    int[ ][ ] arr ={ 
//                   {1, 2, 3}, 
//                   {4, 5, 6}, 
//                   {7, 8, 9}
//                   };
//      for(int i=0;i<arr.length;i++){
//         for(int j=0;j<arr[0].length ;j++){
//              if(j<=0){
//                 System.out.println( arr[i][j]) ;
//              }
//         }
         
//     }
//   System.out.print("Enter num:");
//  int num=sc.nextInt();
//   System.out.print("Enter your std:");
//  int std=sc.nextInt();

//  System.out.print("Enter rate");
//  int r=sc.nextInt();
//  System.out.print("Enter time");
//  int t=sc.nextInt();
//  double s=(p*r*t)/100;
//  System.out.print("Simple Interest is:"+s);
// if(mark>=50 && std >=12){
//     System.out.print("Your are Eligible for MHT-CET");
// }
// else{
//     System.out.print("Your aren't Eligible for MHT-CET");
// }
 //int i=1;
 //int sum=0;
// int x=65;
// do{
//     // char c=(char)x;
//     sum=sum+i;
        
//        // x++;
//         i++;
         

// }while(i<=10);
// int fact=1;
// for( i=1;i<=7;i++){
//    //System.out.println(5*i);
//    fact=fact*i;
// }
//   System.out.println(fact);
// if(num%num==0){
//     System.out.print(num +" is Prime number")
// }
int c=0;
System.out.print("Enter number:");
int num=sc.nextInt();
for(int i=2;i<num;i++){
    if(num==2) System.out.print("Prime");
    if(num%i==0){
        System.out.print("not a prime number");
        c=-1;
        return;
    }
}
if(c==0){
    System.out.print("Number is prime number");
}

      }

}