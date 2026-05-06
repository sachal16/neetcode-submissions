class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      HashMap<Integer, Integer> appear = new HashMap<>();

      PriorityQueue<Map.Entry<Integer, Integer>> heap = 
      new PriorityQueue<Map.Entry<Integer, Integer>>(
        (a,b) -> a.getValue() - b.getValue());

        //add ints and there frequency to hashmap
      for(int num : nums){
        if(appear.containsKey(num)){
            appear.put(num, appear.get(num)+1);
        }else{
            appear.put(num, 1);
        }
      }
      //iterate through hashmap
      for(Map.Entry<Integer,Integer> entry: appear.entrySet()){
        heap.add(entry);
        if(heap.size() > k){
            heap.poll();
        }
      }
      int[] result = new int[k];
      int index =0;
      for(Map.Entry<Integer, Integer> entry: heap){
        result[index++] = entry.getKey();
      }
        
        return result;
    }
}
