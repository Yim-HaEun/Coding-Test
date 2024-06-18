import java.math.*;
class Solution {
    public String solution(String a, String b) {
        BigInteger biga = new BigInteger(a);
        BigInteger bigb = new BigInteger(b);
        BigInteger num = biga.add(bigb);
        
        String answer = num.toString();		// 문자열
        return answer;
    }
}