// Roman to Integer 

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        int ans = 0;
        
        for (int i = 0; i < s.length(); i++) {
            int j = i + 1;
            char cur = s.charAt(i);
            
            if (cur == 'I' && j < s.length()) {
                if (s.charAt(j) == 'V') {
                    ans += 4;
                    i++;
                } else if (s.charAt(j) == 'X') {
                    ans += 9;
                    i++;
                } else {
                    ans += 1;
                }
            } else if (cur == 'X' && j < s.length()) {
                if (s.charAt(j) == 'L') {
                    ans += 40;
                    i++;
                } else if (s.charAt(j) == 'C') {
                    ans += 90;
                    i++;
                } else {
                    ans += 10;
                }
            } else if (cur == 'C' && j < s.length()) {
                if (s.charAt(j) == 'D') {
                    ans += 400;
                    i++;
                } else if (s.charAt(j) == 'M') {
                    ans += 900;
                    i++;
                } else {
                    ans += 100;
                }
            } else {
                ans += map.get(cur);
            }
        }
        return ans;
    }
}