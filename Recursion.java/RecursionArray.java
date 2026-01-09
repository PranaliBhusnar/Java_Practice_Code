public class RecursionArray{
    public static void main(String[] args){
        int[] arr={1,2,4,5,3,6};
    
        recPrint(arr,0);
        
    }
    public static void recPrint(int[] arr,int idx){
            int n=arr.length-1;
        if(idx==n) return ;
        System.out.print(arr[idx]);
        recPrint(arr,idx+1);
    }
}