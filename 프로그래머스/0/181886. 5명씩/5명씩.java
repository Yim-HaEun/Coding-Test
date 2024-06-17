import java.util.*;
class Solution {
    public String[] solution(String[] names) {
        
        ArrayList<String> answer = new ArrayList<>();
        for(int i=0;i<names.length;i+=5){
            answer.add(names[i]);
        }
        String[] arr = new String[answer.size()];
        for(int j=0;j<arr.length;j++){
            arr[j] = answer.get(j);
        }
        return arr;
    }
}