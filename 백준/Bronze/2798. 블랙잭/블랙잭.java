import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        scan.nextLine();
        int[] num=new int[n];
        for(int i=0;i<n;i++) {
        	num[i] = scan.nextInt();
        }
        System.out.println(findSum(num,m));
        scan.close();

    }
    public static int findSum(int[] num, int m) {
    	Arrays.sort(num);//일단 오름차순으로 정렬해줌
    	int closeSum = Integer.MIN_VALUE; //가장 작은 값을 초기설정으로 해줌.
    	for(int i=0;i<num.length-2;i++) {
    		int left =i+1; //두번째 숫자 =포인터 시작
    		int right = num.length-1;//세번째 숫자 =포인터 끝
    		
    		while(left<right) {
    			int sum = num[i]+num[left]+num[right];//세숫자를 더함
    			if(sum<=m) { //목표숫자를 넘지않으면서
    				closeSum = Math.max(closeSum, sum);//현재까지 찾은 수를 비교해 더 큰 숫자(가까운) 선택
    				left++;//더 큰 값을 찾는다.(왼쪽 포인터 증가
    			}else {
    				right--;//m을 넘지 않도록 오른쪽 포인터 감소
    			}
    		}
    	}
    	return closeSum;
    }
}