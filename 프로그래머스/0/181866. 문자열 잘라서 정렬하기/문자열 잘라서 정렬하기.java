import java.util.*;
class Solution {
    public String[] solution(String myString) {
        ArrayList <String> s = new ArrayList<>();
        String[] answer = myString.split("x+");
        Arrays.sort(answer);
        for(int i = 0;i<answer.length;i++){
            if(answer[i].equals("")){
                continue;
            }else{
                s.add(answer[i]);
            }
        }
        String[] arr = new String[s.size()];
        for(int j=0;j<arr.length;j++){
            arr[j]=s.get(j);
        }
        return arr;
    }
}