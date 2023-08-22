import java.util.*;

class Solution {
    
    public int[] solution(int[] arr) {
        int startIdx = -1;
        int endIdx = -1;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                if (startIdx == -1) {
                    startIdx = i;
                }
                endIdx = i;
            }
        }

        return startIdx == -1 ? new int[] {-1} : Arrays.copyOfRange(arr, startIdx, endIdx + 1);
    }
    
}