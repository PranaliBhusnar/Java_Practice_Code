public class array{
    public static void main(String[]args){
        int[] [] arr ={{1,2,3},{4,5,6},{7,8,9}};
        int n=arr.length;
        int m=arr[0].length;
        int p=n-1;
        int q=m-1;
        for(int i = 0; i < n/2; i++) {
            for(int j = 0; j < m; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[n-1-i][m-1-j];
                arr[n-1-i][m-1-j] = temp;
            }
        }
         for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            System.out.print(arr[i][j]);
        }
        System.out.print(" ");}
    }
}