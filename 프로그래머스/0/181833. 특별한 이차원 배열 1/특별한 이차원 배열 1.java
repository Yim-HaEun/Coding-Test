class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int num =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                answer[num][num]=1;//00 11 22 
            }
            num+=1;
        }
        return answer;
    }
}