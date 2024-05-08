import java.util.Arrays;

class Solution {
    public String solution(String my_string, int s, int e) {
        // StringBuilder answer = new StringBuilder(my_string.substring(s, e + 1));
        // answer.reverse();
        // return my_string.substring(0, s) + answer + my_string.substring(e + 1);
        
        String answer = "";
        String[] text = my_string.split("");
        for (int i = s; i <= e; i++) {
            String temp = text[s];
            text[s] = text[e];
            text[e] = temp;
            s++;
            --e;
        }
        for (String result : text) {
            answer += result;
        }
        return answer;
    }
}