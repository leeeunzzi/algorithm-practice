import java.util.Arrays;
class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder answer = new StringBuilder();
        String[] text = my_string.split("");
        String[][] array = new String[text.length / m][m];

        for (int j = 0; j < text.length / m; j++) {
            for (int k = 0; k < m; k++) {
                array[j][k] = text[(j * m) + k];
                if (k == c-1) {
                    answer.append(array[j][k]);
                }
            }
        }
        return answer.toString();
    }
}