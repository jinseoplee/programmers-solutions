class Solution {
    
    public int[] solution(int start, int end_num) {
        int[] ret = new int[start - end_num + 1];
        
        for (int i = 0; i < ret.length; i++) {
            ret[i] = start - i;
        }
        
        return ret;
    }
    
}