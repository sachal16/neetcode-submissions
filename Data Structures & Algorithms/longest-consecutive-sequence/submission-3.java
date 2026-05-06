class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        HashSet<Integer> res = new HashSet<>();
        for(int num : nums){
            res.add(num);
        }
        int longest = 0;
        for(int num: res){
            if(!res.contains(num - 1)){ // start of seq
                int length = 1;
                while(res.contains(num+length)){
                    length++;
                }
                longest = Math.max(longest,length);
            }
            
        }
        return longest;
    }
}
