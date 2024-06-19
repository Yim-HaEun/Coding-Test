class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] sizee = new int[30];
        for(int i=0;i<strArr.length;i++){
            sizee[strArr[i].length()-1]++;
        }
        
        for(int n : sizee){
            if(answer <n) answer = n;
        }
        return answer;
    }
}