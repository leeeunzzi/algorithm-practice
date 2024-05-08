class Solution {
    public String solution(String my_string, int[] indices) {
       String answer = "";
        String[] text = my_string.split("");
        for (int i = 0; i < indices.length; i++) {
            text[indices[i]] = "";
        }

        for (String result : text) answer += result;
        return answer;
    }
}