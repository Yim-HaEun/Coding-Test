import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
    
        ArrayList <Integer> a = new ArrayList<>();
        ArrayList <Integer> b = new ArrayList<>();
        for(int i=n; i<num_list.length; i++){//75
            a.add(num_list[i]);
        }
        for(int j=0;j<n;j++){
            a.add(num_list[j]);
        }
        
        int[] arr = new int[a.size()];
        for(int k=0;k<arr.length;k++){
            arr[k]= a.get(k);
        }
        return arr;
    }
}