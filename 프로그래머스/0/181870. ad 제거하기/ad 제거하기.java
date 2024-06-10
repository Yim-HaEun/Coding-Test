import java.util.*;
class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> answer = new ArrayList<>();
        for(int i =0; i<strArr.length; i++){
            if(strArr[i].contains("ad")){  
                continue;
            }else{
                answer.add(strArr[i]);
            }
        }
        String[] arr = new String[answer.size()];
        for(int j=0;j<arr.length;j++){
            arr[j] = answer.get(j);
        }
        return arr;
    }
}