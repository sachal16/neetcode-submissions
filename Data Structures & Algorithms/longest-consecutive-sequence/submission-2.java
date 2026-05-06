class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        HashSet<Integer> numSet = new HashSet<>();
        for(int num: nums){
            numSet.add(num);
        }
        int longest = 0;
        for(int num : numSet){
            if(!numSet.contains(num - 1)){ // doesnt contain less val (left neighbor)
                int curlength = 1; // start of streak
                while(numSet.contains(num + curlength)){
                    curlength++;
                }
                longest = Math.max(longest, curlength);
            }
        }

        return longest;
    }
}
