class Solution {
    public int solution(String number) {
        int answer = 0;
        int one = 0;
        String[] list = number.split("");
        for (int i = 0; i < list.length; i++) {
            one += Integer.parseInt(list[i]);
        }

        if (one % 9 == one) answer = one;
        else  answer = one % 9;

        return answer;
    }
}