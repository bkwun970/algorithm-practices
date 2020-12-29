// Count Primes

class Solution {
    public int countPrimes(int n) {
        if (n == 0 || n == 1 || n == 2) {
            return 0;
        }
        boolean[] ar = new boolean[n + 1];
        ar[1] = true;
        
        for (int i = 2; i * i < n; i++) {
            
            if (ar[i] == false) {
                
                for (int j = i * i; j < n; j += i) {
                    ar[j] = true;
                }
            }
        }
        
        int cnt = 0;
        
        for (int i = 1; i < n; i++) {
            if (ar[i] == false) {
                cnt++;
            }
        }
        return cnt;
    }
}