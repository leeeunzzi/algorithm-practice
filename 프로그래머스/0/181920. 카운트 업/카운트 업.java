import java.util.*;
class Solution {
    public int[] solution(int start_num, int end_num) {
        
        ArrayList<Integer> intList = new ArrayList<>();
        for(int i=start_num; i<=end_num; i++) {
            intList.add(i);
        }
        
        int[] answer = new int[intList.size()];
        for (int i = 0; i < intList.size(); i++) {
            answer[i] = intList.get(i);
        }
        return answer;
    }
}