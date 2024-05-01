import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < intStrs.length; i++) {
            Integer substring = Integer.valueOf(intStrs[i].substring(s, s + l));
            if (substring > k) resultList.add(substring);
        }
        int[] answer = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            answer[i] = resultList.get(i);
        }
        return answer;
    }
}