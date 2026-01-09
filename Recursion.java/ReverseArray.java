 public class ReverseArray{
    public static void main(String[] args){
        int[] arr={1,2,4,5,3,6};
        int n=arr.length-1;
        recPrint(arr,n);
        
    }
    public static void recPrint(int[] arr,int idx){
        if(idx<0) return ;
        System.out.print(arr[idx]);
        recPrint(arr,idx-1);
    }
}