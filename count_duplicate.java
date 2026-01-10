import java.util.Arrays;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        // HashSet<Integer> set= new HashSet<>();
        // for(int i=0;i<=nums.length-1;i++){
        //     if(nums.length==0) return false;
        //     if(set.contain(nums)){
                
        //     }
        // }
        Arrays.sort(nums);
        // int j=0;
        if(nums.length==0) return false;
        for(int i=0;i<nums.length-1;i++){
            // if(nums.length==0) return false;
            if(nums[i]==nums[i+1]){
                return true;
            }
        } return false;

    }
}