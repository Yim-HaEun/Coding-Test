import java.lang.*;
class Solution {
    public double solution(int a, int b) {
        double answer = 0;
        if(a%2==1 && b%2==1){
            answer = Math.pow(a,2)+ Math.pow(b,2);
        }else if((a%2==1 && b%2==0)||(b%2==1&& a%2==0)){
            answer = 2*(a+b);
        }else if(a%2==0 && b%2==0){
            answer = Math.abs(a-b);
        }
            
        return answer;
    }
}