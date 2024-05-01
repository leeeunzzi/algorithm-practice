class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        String[] str1_array = str1.split("");
        String[] str2_array = str2.split("");
        
        for(int i=0; i<str1.length(); i++) {
            answer += str1_array[i];
            answer += str2_array[i];
        }
        
        
        return answer;
    }
}