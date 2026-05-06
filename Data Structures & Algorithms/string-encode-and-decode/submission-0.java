class Solution {

    public String encode(List<String> strs) {
         List<String> res = new ArrayList<>();
         
         for(String word : strs){
            res.add(word.length() + "#" + word);
            }

           
         return String.join("", res);
        

    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while( i < str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
            String numberStr = str.substring(i,j);
            int length = Integer.parseInt(numberStr);

             i = j+1;
             String word = str.substring(i,i + length);
             result.add(word);
             i = i+ length;
        }

        return result;
    }
}
