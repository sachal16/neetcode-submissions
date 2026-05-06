class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //Make hashMap  Prirority Queue
        HashMap<Integer,Integer> appear = new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>(
            (a, b) -> a.getValue() - b .getValue()
        );
        
        //Puts <Value, Frequency> Into HashMap
        for(int num: nums){
            if(appear.containsKey(num)){
                appear.put(num, appear.get(num)+1);
            } else{
                appear.put(num, 1);
            }
        }

        // Iterate through HashMap and adjust min heap to K
        for(Map.Entry<Integer, Integer> entry : appear.entrySet()){
            heap.add(entry); // add to min heap
            if(heap.size() > k){
                heap.poll();
            }
        }

        //iterate through heap to put heap values into array size[k]
        int[] result = new int[k];
        int index = 0;
        for(Map.Entry<Integer, Integer> entry: heap){
            result[index++] = entry.getKey();
        }

        return result;

    }
}
