import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer1 = Arrays.copyOfRange(arr,intervals[0][0],intervals[0][1]+1);
        int[] answer2 = Arrays.copyOfRange(arr,intervals[1][0],intervals[1][1]+1);
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0;i<answer1.length;i++){
            answer.add(answer1[i]);
        }
        for(int i=0;i<answer2.length;i++){
            answer.add(answer2[i]);
        }
        int[] a = new int[answer.size()];
        for(int k=0;k<a.length;k++){
            a[k]=answer.get(k);
        }
        return a;
    }
}