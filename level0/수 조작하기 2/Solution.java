class Solution {
    
    public String solution(int[] numLog) {
        String result = "";
    
        for (int i = 1; i < numLog.length; i++) {
            int sub = numLog[i] - numLog[i - 1];
            if (sub == 1) {
                result += "w";
            } else if (sub == -1) {
                result += "s";
            } else if (sub == 10) {
                result += "d";
            } else if (sub == -10) {
                result += "a";
            }
        }
        
        return result;
    }
    
}