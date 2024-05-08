class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for (int i = 0; i < my_string.length(); i++) {
            char charAt = my_string.charAt(i);
            if (charAt >= 65 && charAt <= 90) {   // 대문자
                answer[charAt - 65]++;
            } else if (charAt >= 97 && charAt <= 122) {     // 소문자 (97-26=71)
                answer[charAt - 71]++;
            }
        }
        return answer;
    }
}