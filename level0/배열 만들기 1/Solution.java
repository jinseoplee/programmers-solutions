class Solution {
    
    public int[] solution(int n, int k) {
        int[] ret = new int[n / k];
        
        for (int i = 0; i < ret.length; i++) {
            ret[i] = k * (i + 1);
        }
        
        return ret;
    }
    
}