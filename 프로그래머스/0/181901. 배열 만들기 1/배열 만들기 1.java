import java.util.*;
class Solution {
    public int[] solution(int n, int k) {
        ArrayList <Integer> answer = new ArrayList<>();
        for(int i =1; i<=n;i++){
            if(i%k==0){
                answer.add(i);
            }
        }
        int[] arr = new int[answer.size()];
        for(int j =0; j<answer.size();j++){
            arr[j]=answer.get(j);
        }
        return arr;
    }
}