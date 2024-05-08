class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        boolean result = my_string.startsWith(is_prefix);
        if (result) answer = 1;
        else answer = 0;
        return answer;
    }
}