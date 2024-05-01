class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";

        for (int i = 0; i < my_strings.length; i++) {
            String[] split = my_strings[i].split("");
            int one = parts[i][0];
            int two = parts[i][1];
            for (int j = one; j <= two; j++) {
                answer += split[j];
            }
        }
        return answer;
    }
}