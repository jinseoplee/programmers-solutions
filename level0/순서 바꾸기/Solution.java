class Solution {
    
    public int[] solution(int[] num_list, int n) {
        int[] ret = new int[num_list.length];
        
        for (int i = n; i < num_list.length; i++) {
            ret[i - n] = num_list[i];
        }
        
        for (int i = 0; i < n; i++) {
            ret[i + num_list.length - n] = num_list[i];
        }
        
        return ret;
    }
    
}