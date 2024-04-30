class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        
        for(int i=0; i<queries.length; i++) {
            // queries[0] [0,3]
            // queries[1] [1,2]
            // queries[2] [1,4]
            for(int j=0; j<queries[i].length-1; j++) {
                // queries[0][0] 0
                // queries[0][1] 3
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