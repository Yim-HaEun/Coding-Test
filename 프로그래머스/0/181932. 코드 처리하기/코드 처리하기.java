class Solution {
    public String solution(String code) {
        String answer = "";
        String ret = "";
        boolean mode= false;
        char[] co = code.toCharArray();
        
        for(int i =0; i<co.length; i++){//반복문으로 읽고
            if(co[i] == '1'){//mode의 상태 바꾸는 삼항연산자
                 mode = !mode;
            }
            else if (mode == false && (i%2==0)){
                ret+=co[i];
            }
            else if(mode == true && (i%2==1)){
                ret+=co[i];
            }
        }
        if (ret == ""){
            return "EMPTY";
        }else{
            return ret;
        }
    }
}