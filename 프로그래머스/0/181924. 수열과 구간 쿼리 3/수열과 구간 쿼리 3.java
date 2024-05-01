class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        
        for(int i=0; i<queries.length; i++) {
            for(int j=0; j<queries[i].length-1; j++) {
                int temp = 0;
                temp = arr[queries[i][j]];
                arr[queries[i][j]] = arr[queries[i][j+1]];
                arr[queries[i][j+1]] = temp;
            }
        }
        answer = arr;
        return answer;
    }
}