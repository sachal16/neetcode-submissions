class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Integer> map1 = buildmap(s);
        HashMap<Character,Integer> map2 = buildmap(t);

        return map1.equals(map2);
    }


    public HashMap<Character, Integer> buildmap(String str){
        HashMap<Character,Integer> map = new HashMap<>();
        for(char letter: str.toCharArray()){
            if(map.containsKey(letter)){
                map.put(letter,map.get(letter)+1);
            }else{
                map.put(letter, 1);
            }
        }
        return map;
    }
}
