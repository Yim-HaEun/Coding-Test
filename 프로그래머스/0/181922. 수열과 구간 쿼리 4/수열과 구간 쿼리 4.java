class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr.clone();
        for(int i =0;i<arr.length;i++){
            for(int j=0;j<queries.length;j++){
                if(queries[j][0]<=i && queries[j][1] >=i && i%queries[j][2]==0){
                    answer[i] +=1;
                }
            }
        }
        return answer;
    }
}