// 28. Implement strStr()

// kmp solution

class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        if (needle.length() > haystack.length()) {
            return -1;
        }
        
        int[] last = lastOccurrence(needle);
        int n = haystack.length();
        int m = needle.length();
        int i = 0;
        int j = 0;
        
        while (i <= n - m) {
            while (j < m && Character.compare(needle.charAt(j), haystack.charAt(i + j)) == 0) {
                j++;
            }
            
            if (j == 0) {
                i++;
            } else {
                if (j == m) {
                    return i;
                }
                int align = last[j - 1];
                i = i + j - align;
                j = align;
            }
        }
        
        return -1;
    }
    
    private int[] lastOccurrence(String needle) {
        
        int m = needle.length();
        int[] ft = new int[m];
        if (m == 0) {
            return ft;
        }

        int i = 0;
        int j = 1;
        ft[0] = 0;
        
        while (j < m) {
            int check = Character.compare(needle.charAt(i), needle.charAt(j));
            
            if (check == 0) {
                ft[j] = i + 1;
                i++;
                j++;
            } else if (check != 0 && i == 0) {
                ft[j] = 0;
                j++;
            } else if (check != 0 && i != 0) {
                i = ft[i - 1];
            }
        }
        return ft;
    }
}

// another solution

class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length()==0) return 0;
        int idx = 0;
        if (haystack.contains(needle)) {
            for (int i=0;i<haystack.length()-needle.length()+1;i++) {
                if (haystack.substring(i,i+needle.length()).contains(needle)) {
                    idx = i;
                    break;
                }
            }
            return idx;
        } else return -1;
    }
}