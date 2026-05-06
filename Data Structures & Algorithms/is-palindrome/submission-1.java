class Solution {
    public boolean isPalindrome(String s) {
        if(s == null){
            return false;
        }
        s = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        int left = 0;
        int right = s.length()-1;
        while(left < right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }else{
                left++;
                right--;
            }
        }
        return true;
    }
}
