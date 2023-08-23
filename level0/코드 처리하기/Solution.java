class Solution {
    
    public String solution(String code) {
        String ret = "";
        int mode = 0;
        
        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);
            
            if (c == '1') {
                mode = mode == 0 ? 1 : 0;
                continue;
            }
            
            if ((mode == 0 && i % 2 == 0) || (mode == 1 && i % 2 == 1)) {
                ret += c;
            }
        }
        
        return ret.length() == 0 ? "EMPTY" : ret;
    }
    
}