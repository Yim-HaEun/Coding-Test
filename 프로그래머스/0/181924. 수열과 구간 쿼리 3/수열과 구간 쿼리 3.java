class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr.clone();
        for(int k =0;k<queries.length;k++){
            int i = queries[k][0];
            int j = queries[k][1];
            int arri = answer[i];
            int arrj = answer[j];
            answer[i] = arrj;
            answer[j] = arri;
        }
        return answer;
    }
}