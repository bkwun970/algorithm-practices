// Plus One

class Solution {
    public int[] plusOne(int[] digits) {
        int cnt = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
                cnt++;
            } else {
                digits[i] = digits[i] + 1;
                break;
            }
        }
        
        if (cnt == digits.length && digits[0] == 0) {
            int[] tmp = new int[digits.length + 1];
            tmp[0] = 1;
            
            for (int i = 0; i < digits.length; i++) {
                tmp[i + 1] = digits[i];
            }
            return tmp;
        }
        
        return digits;
    }
}