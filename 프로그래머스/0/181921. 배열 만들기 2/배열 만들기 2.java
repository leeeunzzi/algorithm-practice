import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
       ArrayList<Integer> intList = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            if (String.valueOf(i).matches("[05]+")) intList.add(i);
        }
        if (intList.isEmpty()) return new int[]{-1};

        int[] answer = new int[intList.size()];
        for (int i = 0; i < intList.size(); i++) {
            answer[i] = intList.get(i);
        }
        return answer;
    }
}