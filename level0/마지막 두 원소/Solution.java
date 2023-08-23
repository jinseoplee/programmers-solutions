class Solution {
    
    public int[] solution(int[] num_list) {
        int length = num_list.length;
        int sub = num_list[length - 1] - num_list[length - 2];
        
        int[] ret = new int[length + 1];
        System.arraycopy(num_list, 0, ret, 0, length);
        
        if (sub > 0) {
            ret[length] = sub;
        } else {
            ret[length] = num_list[length - 1] * 2;
        }
        
        return ret;
    }
    
}