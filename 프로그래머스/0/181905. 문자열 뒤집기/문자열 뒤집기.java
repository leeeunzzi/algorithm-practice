import java.util.Arrays;

class Solution {
    public String solution(String my_string, int s, int e) {
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