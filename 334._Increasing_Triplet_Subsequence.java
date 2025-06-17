class Solution {
    public boolean increasingTriplet(int[] nums) {
        if (nums == null || nums.length < 3) {
            return false;
        }
        int primary = Integer.MAX_VALUE;
        int secondary = Integer.MAX_VALUE;
        for(int i =0; i< nums.length; i++){
            if(nums[i] <= primary){
                primary = nums[i];
            }
            else if(nums[i] <= secondary){
                secondary = nums[i];
            }
            else{
                return true;
            }
        }
        return false;
    }
}