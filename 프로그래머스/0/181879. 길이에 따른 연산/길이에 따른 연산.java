class Solution {
    public int solution(int[] num_list) {
        int answer = 1;
        int len = num_list.length;
        int num =0;
        if(len >= 11){
            for(int i=0;i<len;i++){
                answer += num_list[i];
            }
            answer -=1;
        }
        else if(len<=10){
            for(int j=0;j<len;j++){
                answer *= num_list[j];
            }
        }
        
        return answer;
    }
}