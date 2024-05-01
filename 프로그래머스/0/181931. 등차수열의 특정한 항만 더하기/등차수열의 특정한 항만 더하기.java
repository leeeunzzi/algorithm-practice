class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        
        int[] arr = new int[included.length];
        for(int i=0; i<arr.length; i++) {
            arr[i] = i == 0 ? a : arr[i-1] + d;
        }
        
        for(int i=0; i<included.length; i++) {
            if(included[i]) {
                answer +=arr[i];
            }
        }
    
        
        
        return answer;
    }
}