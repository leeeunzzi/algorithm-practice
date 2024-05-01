class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        String ret = "";
        String[] code_array = code.split("");
        for(int i = 0; i<code_array.length; i++) {
            if(mode ==0) {
                if(code_array[i].equals("1")) {
                mode = 1;
            } else {
                if(i % 2 ==0) {
                    ret += code_array[i];
                }
            }
            } else {
                if(code_array[i].equals("1")) {
                mode = 0;
            } else {
                if(i % 2 ==1) {
                    ret += code_array[i];
                }
            }
            }
        }
            
            answer = ret == "" ? "EMPTY" : ret;
        
        return answer;
    }
}