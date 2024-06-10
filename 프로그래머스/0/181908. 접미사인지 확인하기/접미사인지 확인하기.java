class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        if (is_suffix.length()<=my_string.length()){
            int end = is_suffix.length();
            int start = my_string.length() - end;
            String is = my_string.substring(start,my_string.length());
            if(is.equals(is_suffix)){
                answer = 1;
            }else {
                answer = 0;
            }
        }else {
            answer = 0;
        }
        
        
        return answer;
    }
}