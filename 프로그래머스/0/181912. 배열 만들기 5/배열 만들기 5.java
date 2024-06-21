import java.util.*;

class Solution {
    public List<Integer> solution(String[] intStrs, int k, int s, int l) {
        
        List<Integer> answer = new ArrayList<>();
        
        for(int i=0; i<intStrs.length; i++){

            int end = s+l;
            int str = Integer.parseInt(intStrs[i].substring(s, end));
            
            if( k < str ){
                answer.add(str);
            }
      
        } 
        
        return answer;
    }
}