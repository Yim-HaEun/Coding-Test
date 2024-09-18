class Solution {
    public int solution(int[] box, int n) {
        int answer = 1;
        for(int d : box){
            answer *= (d/n);
        }
       
        return answer;
    }
}