import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        String substring = "";
        ArrayList<String> resultList = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
            substring = my_string.substring(i, my_string.length());
            resultList.add(substring);
            Collections.sort(resultList);
        }

        String[] answer = new String[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            answer[i] = resultList.get(i);
        }
        return answer;
    }
}