import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
       
        List<Integer> answer = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int num = arr[i];//반복할 숫자
            for(int j=0;j<num;j++){
                answer.add(arr[i]);
            }
        }
        int[] a = new int[answer.size()];
        for(int k=0;k<a.length;k++){
            a[k] = answer.get(k);
        }
        
        return a;
    }
}