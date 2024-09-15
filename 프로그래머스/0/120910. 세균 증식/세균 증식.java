import java.lang.Math;
class Solution {
    public int solution(int n, int t) {
        double gop = Math.pow(2,t);
        double answer = gop*n;
        return (int)answer;
    }
}