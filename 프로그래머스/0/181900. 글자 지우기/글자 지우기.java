class Solution {
    public String solution(String my_string, int[] indices) {
        String[] answer = my_string.split("");
        for(int i=0;i<indices.length;i++){
            int n = indices[i];
            answer[n] = "";
        }
        my_string=String.join("",answer);
        return my_string;
    }
}