public Class SegregateArr{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array");
        int n=sc.nextInt();
        System.out.print("Enter the element in the array ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
        }
          
    }
}