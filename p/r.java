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
   int[ ][ ] arr ={ 
                  {1, 2, 3}, 
                  {4, 5, 6}, 
                  {7, 8, 9}
                  };
     for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length ;j++){
             if(j<=0){
                System.out.println( arr[i][j]) ;
             }
        }
         
    }
    
}
}