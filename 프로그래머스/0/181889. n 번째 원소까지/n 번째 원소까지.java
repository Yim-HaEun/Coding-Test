import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0; i<n;i++){
            answer.add(num_list[i]);
        }
        int[] arr = new int[answer.size()];
        for(int j=0;j<arr.length;j++){
            arr[j] = answer.get(j);
        }
        return arr;
    }
}