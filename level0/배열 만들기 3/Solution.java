class Solution {
    
    public int[] solution(int[] arr, int[][] intervals) {
        int[] ret = new int[(intervals[0][1] - intervals[0][0]) + (intervals[1][1] - intervals[1][0]) + 2];
        System.arraycopy(arr, intervals[0][0], ret, 0, intervals[0][1] - intervals[0][0] + 1);
        System.arraycopy(arr, intervals[1][0], ret, intervals[0][1] - intervals[0][0] + 1, intervals[1][1] - intervals[1][0] + 1);
        return ret;
    }
    
}