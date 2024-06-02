import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = num_list.clone();
        int len = num_list.length;
        answer = Arrays.copyOf(answer,answer.length+1); //Arrays.copyOf로 크기 늘려주기 
        
        if(num_list[len-1]>num_list[len-2]){
             answer[len] = num_list[len-1]-num_list[len-2];
        }else{
            answer[len] = num_list[len-1]*2;
        }
        
          
        return answer;
    }
}