class Solution {
    public int smallestEqual(int[] nums) {
        int index=-1;
        int j=0;
        int [] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i%10==nums[i]){
                //  index=i;
                //  index=Math.min(index,nums.length-1 );
                 //if(i==nums.length-1) return 0;
                 arr[j]=i;
                 j++;
                 index=0;
            }
    

        }
        if(index==-1){
            return -1;
        }
        return arr[0];
    }
}