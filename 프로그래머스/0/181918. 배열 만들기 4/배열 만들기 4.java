import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int i = 0;
        ArrayList<Integer> resultList = new ArrayList<>();

        while (i < arr.length) {
            if (resultList.isEmpty()) {
                resultList.add(arr[i]);
                i += 1;
            } else {
                if (resultList.get(resultList.size() - 1) < arr[i]) {
                    resultList.add(arr[i]);
                    i += 1;
                } else {
                    resultList.remove(resultList.size() - 1);
                }
            }
        }
        
        int[] stk = new int[resultList.size()];
        for (int j = 0; j < resultList.size(); j++) {
            stk[j] = resultList.get(j);
        }
        
        return stk;
    }
}