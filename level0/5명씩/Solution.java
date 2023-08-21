class Solution {
    
    public String[] solution(String[] names) {
        String[] ret = new String[names.length % 5 == 0 ? names.length / 5 : names.length / 5 + 1];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = names[i * 5];
        }
        return ret;
    }
    
}