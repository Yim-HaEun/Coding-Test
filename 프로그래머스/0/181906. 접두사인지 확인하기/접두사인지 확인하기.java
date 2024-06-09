class Solution {
    public int solution(String my_string, String is_prefix) {
        int ip = is_prefix.length();
        int answer = 0;
        if(ip<=my_string.length()){
            String ms =  my_string.substring(0,ip);
            if(ms.equals(is_prefix)){
                answer = 1;
            }else{
                answer = 0;
            }
        }
        else{
              answer = 0;  
            }
            
        
        
        
        return answer;
    }
}