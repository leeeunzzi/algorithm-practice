import java.util.*;
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> resultList = new ArrayList<>();
        while (n != 1) {
            resultList.add(n);
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
        }

        if (n == 1) resultList.add(1);

        int[] answer = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            answer[i] = resultList.get(i);
        }
        return answer;
    }
}