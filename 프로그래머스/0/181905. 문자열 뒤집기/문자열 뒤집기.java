class Solution {
    public String solution(String my_string, int s, int e) {
        
        String answer = my_string.substring(0,s);
        String middle = my_string.substring(s,e+1);
        String last = my_string.substring(e+1);
        StringBuffer sb = new StringBuffer(middle);
        String reverse = sb.reverse().toString();
        answer+=reverse;
        answer +=last;
        return answer;
    }
}