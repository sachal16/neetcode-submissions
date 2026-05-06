class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> map1 = compare(s);
        HashMap<Character, Integer> map2 = compare(t);

        return map1.equals(map2);
    }
    public HashMap<Character, Integer> compare(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        for(char letter: str.toCharArray()){
            if(map.containsKey(letter)){
                map.put(letter, map.get(letter) + 1);
            } else{
                map.put(letter, 1);
            }
        }
        return map;
    }
}
