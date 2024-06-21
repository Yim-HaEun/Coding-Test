import java.util.*;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
         List<Integer> str = new ArrayList<>();
       
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        int num =0;
        switch(n){
            case 1:
                for(int i =0; i<b+1; i++) {
                str.add(num_list[i]);
            }
                break;
            case 2:
                for(int i = a; i<num_list.length; i++) {
                str.add(num_list[i]);
            }
                break;
            case 3:
                for(int i = a; i<b+1; i++) {
                str.add(num_list[i]);
            }
                break;
            case 4:
                for(int i = a; i<b+1; i+=c) {
                str.add(num_list[i]);
                }
                break;
            default :
                break;
        }
        int[] answer = str.stream().mapToInt(x -> x).toArray();
        return answer;
    }
}