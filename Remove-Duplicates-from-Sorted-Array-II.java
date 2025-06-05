class Solution {
    public int removeDuplicates(int[] nums) {
        
        int j=0,c=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[j]){
                c++;
            }else{
                c=1;
            }
            if(c<=2){
                    j++;
                    nums[j] = nums[i];
            }
        }
        return j+1;
        
    }
}