// leet code 344. Reverse Integer

class Solution {
    public int reverse(int x) {
        if (x == 0) {
            return x;
        }
        int check = 1;
        if (x < 0) {
            check = -1;
        }
        String xString = Math.abs(x) + "";
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        
        sb.append(xString);
        sb.reverse();
        
        if (check == 1) {
            sb2.append(sb.toString());
        } else {
            sb2.append("-");
            sb2.append(sb.toString());
        }
        int tmp = 0;
        try {
            tmp = Integer.parseInt(sb2.toString());
        } catch (Exception e) {
            return 0;
        }
        
        return tmp;
    }
}

// push & pop solution - reverse integer.

class Solution {
    public int reverse(int x) {
        if (x == 0) {
            return 0;
        }
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE && pop > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE && pop < -8)) {
                return 0;
            }
            
            rev = (rev * 10) + pop;
        }
        return rev;
    }
}