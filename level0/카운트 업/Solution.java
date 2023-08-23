class Solution {
    
    public int[] solution(int start, int end) {
        int[] ret = new int[end - start + 1];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = start + i;
        }
        return ret;
    }
    
}