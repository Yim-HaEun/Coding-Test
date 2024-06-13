class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int arr = 0; 
        int a = 0;
        int b = 0;
        int a1 = arr1.length;
        int a2 = arr2.length;
        
        int answer = ab(a1,a2);
        
        if(answer == 0){
            for(int i=0;i<a1;i++){
                a+=arr1[i];
                b+=arr2[i];
            }
        arr = ab(a,b);   
        
    }else{
            arr =answer; 
    }
        return arr;
    }
    public int ab(int a, int b){
        if (a<b){
            return -1;
        }else if(a>b){
            return 1;
        }else{
            return 0;
        }
    }
}
