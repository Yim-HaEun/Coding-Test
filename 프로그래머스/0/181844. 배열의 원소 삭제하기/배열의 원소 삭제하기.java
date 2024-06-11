import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> lists = new ArrayList<>();
        for(int k=0; k<arr.length;k++){
            lists.add(arr[k]);
        }
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<delete_list.length;j++){
                 if(arr[i] == delete_list[j]){
                     lists.remove(Integer.valueOf(arr[i]));
                 }
            }
        }
        
        int[] answer = new int[lists.size()];
        for(int k=0;k<answer.length;k++){
            answer[k] = lists.get(k);
        }
        return answer;
    }
}