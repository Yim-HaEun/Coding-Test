
import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        myStr = myStr.replaceAll("a","/");
        myStr = myStr.replaceAll("b","/");
        myStr = myStr.replaceAll("c","/");
        String[] answer = myStr.split("/+");
        List <String> str = new ArrayList<>();
        if(answer.length==0){
            return new String[]{"EMPTY"};
        }else{
            for(int i=0;i<answer.length;i++){
            if (answer[i].equals("")){
               continue;
            }else{
                 str.add(answer[i]);
            }
        }
        String[] arr = new String[str.size()];
        for(int j=0;j<arr.length;j++){
            arr[j]=str.get(j);
        }
        return arr;
        }
    }
}