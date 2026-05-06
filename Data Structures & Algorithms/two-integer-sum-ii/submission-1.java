class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> res = new HashMap<>();
        for(int i = 0; i < numbers.length; i++){
            int num = numbers[i];
            int diff = target - num;
            if(res.containsKey(diff)){
                return new int[]{res.get(diff),i+1};
            }else{
                res.put(num,i+1);
            }
        }
        return new int[0];
    }
}
