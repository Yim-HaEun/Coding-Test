class Solution {
    public int solution(String number) {
        String[] n = number.split("");
        int num =0;
        for(int i=0;i<n.length;i++){
            String a = n[i];
            num+=Integer.parseInt(a);
        }
        
        int answer = num%9;
        return answer;
    }
}