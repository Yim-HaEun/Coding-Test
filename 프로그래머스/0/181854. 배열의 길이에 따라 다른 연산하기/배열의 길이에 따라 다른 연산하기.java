class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = {};
        int odd =0;
        if(arr.length%2==1){
            odd+=1;//홀수
        }
        if(odd ==0){ //짝수라면 
            for(int i=1;i<arr.length;i+=2){
                arr[i]=arr[i]+n;
            }
        }else{
            for(int i=0;i<arr.length;i+=2){
                arr[i]=arr[i]+n;
            }
        }
       
        return arr;
    }
}