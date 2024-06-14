import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> num = new ArrayList<>();
        for(int i=0;i<num_list.length;i+=n){
            num.add(num_list[i]);
        }
        int[] arr = new int[num.size()];
        for(int j=0;j<arr.length;j++){
            arr[j]= num.get(j);
        }
        return arr;
    }
}