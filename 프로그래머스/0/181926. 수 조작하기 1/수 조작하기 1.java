class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        
        String[] cont_array = control.split("");
        
        for(int i=0; i<cont_array.length; i++) {
            if(cont_array[i].equals("w")) n+=1;
            else if(cont_array[i].equals("s")) n-=1;
            else if(cont_array[i].equals("d")) n+=10;
            else if(cont_array[i].equals("a")) n-=10;
        }
        
        
        answer = n;
        return answer;
    }
}