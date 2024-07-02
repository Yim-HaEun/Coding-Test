class Solution {
    public int[] solution(int n) {
        int num = (n+1)/2;
        int[] answer = new int[num];
        int k =0;
        for(int i=0;i<=n;i++){
            if(i%2==1){
                answer[k]=i;
                k++;
            }else{
                continue;
            }
        }
        return answer;
    }
}