class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        //make hash and PQueue (min Heap)
        HashMap<Integer, Integer> res = new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<> (
            (a,b) -> a.getValue() - b.getValue()
        );
        //iterate through [] add to hash
        for(int num : nums){
            if(res.containsKey(num)){
                res.put(num, res.get(num)+1);
            }else{
                res.put(num, 1);
            }
        }
        //iterate through hash add to heap
        for(Map.Entry<Integer,Integer> entry: res.entrySet()){
            minHeap.add(entry);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
        //iterate through heap to return array
        int[] result = new int[k];
        int index = 0;
        for(Map.Entry<Integer, Integer> entry: minHeap){
            result[index++] = entry.getKey();
        }

        return result;
    }
}
