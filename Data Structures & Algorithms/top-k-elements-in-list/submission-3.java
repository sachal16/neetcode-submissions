class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       HashMap<Integer, Integer> map = new HashMap<>();
       PriorityQueue<Map.Entry<Integer,Integer>> minHeap = new PriorityQueue<>(
        (a,b) -> a.getValue() - b.getValue()
       );

       //iterate array & add hash
       for(int num: nums){
        if(map.containsKey(num)){
            map.put(num, map.get(num)+1);
        }else{
            map.put(num,1);
        }
       }
       //iterate Hash & add & adjust to heap
       for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            minHeap.add(entry);
            if(minHeap.size() > k ){
                minHeap.poll();
            }
       }
       //go through final heap and add to a array; intial 0 up to whatever one less than k.
       int[] result = new int [k];
       int index = 0;
       for(Map.Entry<Integer,Integer> entry: minHeap){
        result[index++] = entry.getKey();
       }

       return result;
    }
}
