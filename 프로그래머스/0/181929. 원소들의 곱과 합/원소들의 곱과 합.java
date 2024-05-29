class Solution {
    public int solution(int[] num_list) {
        int hap = 0;
        int gop = 1;
        for(int i = 0; i < num_list.length; i++){
            gop *= num_list[i];
        }
        for(int j = 0; j<num_list.length; j++){
            hap += num_list[j];
        }
       if ((hap*hap) > gop) {
           return 1;
       }
        else{
          return 0;
       }
      
    }
    
}