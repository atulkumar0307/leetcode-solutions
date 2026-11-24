class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder newStr = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                newStr.append(Character.toLowerCase(ch));
            }
        }
        int left = 0;
        int right = newStr.length() - 1;
        while(left < right){
            if(newStr.charAt(left) == newStr.charAt(right)){
                left++;
                right--;
            }else{
                return false;
            }
        }
        return true;
    }
}