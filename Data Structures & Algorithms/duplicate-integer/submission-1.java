class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        
        for(int i = 0; i < nums.length; i++){
            int val_1 = nums[i];

            for(int j = i+1; j < nums.length; j++){
                int val_2 = nums[j];

                if(val_1 == val_2){
                    return true;
                }
            }
        }

        return false;
    }
}