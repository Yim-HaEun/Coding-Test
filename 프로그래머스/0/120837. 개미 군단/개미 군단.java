class Solution {
    public int solution(int hp) {
        int arm,wrk =0 ;
        int answer = 0;
        answer+= hp/5;
        arm = hp%5;
        answer += arm/3;
        wrk = arm%3;
        answer += wrk;
        return answer;
    }
}