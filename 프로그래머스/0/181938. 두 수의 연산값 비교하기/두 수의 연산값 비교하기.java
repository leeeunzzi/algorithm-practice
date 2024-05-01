class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int one = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int two = 2 * a * b;
        
        if (one >= two) {
            answer = one;
        } else {
            answer = two;
        }
        
        return answer;
    }
}