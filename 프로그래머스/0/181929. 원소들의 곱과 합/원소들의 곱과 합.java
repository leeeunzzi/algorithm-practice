class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int one = 1;
        int two = 0;
        
        for(int i=0; i<num_list.length; i++) {
            one = one * num_list[i];
            two = two + num_list[i];
        }
        two = two*two;
        
        if ( one < two) {
            answer = 1;
        } else {
            answer = 0;
        }
        
        
        return answer;
    }
}