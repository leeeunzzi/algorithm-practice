class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        String[] text = code.split("");
        for (int i = 0; i < text.length; i++) {
            if (i % q == r) {
                answer += text[i];
            }
        }
        return answer;
    }
}