class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        //first val
        for(int i = 0; i < nums.length; i++){
            if(nums[i]> 0){
                break;
            } if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            //two sum
            int l = i+1;
            int r = nums.length - 1;
            while(l < r){
                int threeSum = nums[i] + nums[l] +nums[r];
                if(threeSum > 0){
                    r--;
                } else if(threeSum < 0){
                    l++;
                } else {
                    res.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++;
                    //check dupes on two sums pointers
                    while(nums[l] == nums[l - 1] && l < r){
                        l++;
                    }
                }

            }
        }
        return res;
    }
}
