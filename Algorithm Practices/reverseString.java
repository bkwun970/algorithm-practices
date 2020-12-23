// leet code 344. Reverse String

class Solution {
    public void reverseString(char[] s) {
        if (s == null || s.length == 0) {
            return;
        }
        int middle = s.length / 2;
        int i = 0;
        int j = s.length - 1;
        
        while (i <= j) {
            char tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
            
            i++;
            j--;
        }
    }
}