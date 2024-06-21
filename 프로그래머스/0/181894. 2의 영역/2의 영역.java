import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> index = new LinkedList<>();
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == 2){
                index.add(i);
            }
        }
        if(index.size() == 0){ //없으면
            return new int[]{-1};
        }
        int start = index.get(0);//첫번째자리
        int end = index.get(index.size()-1);//마지막자리
        answer = Arrays.copyOfRange(arr,start,end+1);
        return answer;
    }
}