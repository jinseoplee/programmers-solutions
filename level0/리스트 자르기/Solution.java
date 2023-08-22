import java.util.*;

class Solution {
    
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        int[] ret = {};
        
        if (n == 1) {
            ret = Arrays.copyOfRange(num_list, 0, b + 1);
        } else if (n == 2) {
            ret = Arrays.copyOfRange(num_list, a, num_list.length);
        } else if (n == 3) {
            ret = Arrays.copyOfRange(num_list, a, b + 1);
        } else if (n == 4) {
            ret = new int[(b - a + 1) % c == 0 ? (b - a + 1) / c : (b - a + 1) / c + 1];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = num_list[a + (i * c)];
            }
        }
        
        return ret;
    }
    
}