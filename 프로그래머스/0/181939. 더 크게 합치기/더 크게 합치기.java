class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String result1 = String.valueOf(a) + String.valueOf(b);
        String result2 = String.valueOf(b) + String.valueOf(a);
        
        int result1_int = Integer.parseInt(result1);
        int result2_int = Integer.parseInt(result2);
        
        if ( result1_int > result2_int) {
            answer = result1_int;
        } else {
            answer = result2_int;
        }
        
        return answer;
    }
}