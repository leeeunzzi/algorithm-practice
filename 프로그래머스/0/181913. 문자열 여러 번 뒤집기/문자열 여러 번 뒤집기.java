import java.util.*;
class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        String[] strList = my_string.split("");

        for (int[] query : queries) {
            int one = query[0];
            int two = query[1];

            while (one < two) {
                String temp = strList[one];
                strList[one] = strList[two];
                strList[two] = temp;
                one++;
                two--;
            }
        }
        for (String result : strList) answer += result;

        return answer;
    }
}