class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int[] sum =new int[included.length];
        for(int i= 0; i <included.length; i++){ //반복문
            if(i==0){
                sum[0] =a;
            }else {
                sum[i] = a +i*d;
            }
            if(included[i] == true){
                answer+= sum[i]; 
            }
        }
        return answer;
    }
}