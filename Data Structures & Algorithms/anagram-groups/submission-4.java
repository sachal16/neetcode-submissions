class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> res = new HashMap<>();
        for(String word: strs){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedKey = new String(chars);

            if(res.containsKey(sortedKey)){
                res.get(sortedKey).add(word);
            }else{
                res.put(sortedKey, new ArrayList<>());
                res.get(sortedKey).add(word);
            }
        }
        return new ArrayList<>(res.values());
    }
}
