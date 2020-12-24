// Valid Palindrome

class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        
        s = s.toLowerCase();
        s.replaceAll(" ", "");
        
        for (int i = 0; i < s.length(); i++) {
            char tmp = s.charAt(i);
            if ((97 <= tmp && tmp <= 122) || (48 <= tmp && tmp <= 57)) {
                sb.append(tmp);
            }
        }
        
        return sb.toString().equals(sb.reverse().toString());
    }
}