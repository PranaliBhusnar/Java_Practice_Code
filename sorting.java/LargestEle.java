import java.util.*;
public class LargestEle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }int max,j;
        for(int i=0;i<n;i++){
              max=i;
        for( j=i+1;j<n;j++){
            
            if(arr[max]<arr[j]){
                max=j;
            }
        }
        
        } System.out.print(arr[max]);
         
        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i]);
        // }
    }
}
