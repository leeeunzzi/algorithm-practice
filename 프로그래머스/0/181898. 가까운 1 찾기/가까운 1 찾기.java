class Solution {
    public int solution(int[] arr, int idx) {
        int answer = 0;
        for (int i = idx; i < arr.length; i++) {
            if (i >= idx && arr[i] == 1) {
                answer = i;
                return answer;
            } else answer = -1;
        }
        return answer;
    }
}