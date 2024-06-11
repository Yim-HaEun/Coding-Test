
class Solution {
    public String solution(String n_str) {
        String[] s = new String[n_str.length()];
        for(int i=0;i<s.length;i++){
            if(n_str.substring(0,1).equals("0")){
                n_str = n_str.substring(1);
            }else if(n_str.substring(0,0) != "0"){
                break;
            }
        }
        
        return n_str;
    }
}