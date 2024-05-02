class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        String[] text = new String[my_string.length()];

        for (int i = 0; i < text.length; i++) {
            text[i] = my_string.substring(i, my_string.length());
            System.out.println(i + text[i]);
            if(is_suffix.equals(text[i])) {
                answer = 1;
                return answer;
            } 
            else answer = 0;
        }
        return answer;
    }
}