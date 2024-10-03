import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	int num[] = new int[3];
    	for(int i=0;i<3;i++) {
    		num[i] = scan.nextInt();
    	}
    	Arrays.sort(num);
    	//세변이 같을때,
    	if(num[0]==num[1]&&num[0]==num[2]) {
    		System.out.println(num[0]*3);
    	}else {//가장 긴 변이 나머지 두변을 합한것보다 크거나 같으면, 가장 긴변을 a+b-1로 바꾼뒤 더한다.
    		if(num[2]>=num[0]+num[1]) {
    			num[2]=num[0]+num[1]-1;
    		}
    		System.out.println(num[0]+num[1]+num[2]);
    	}
    	scan.close();
    }
}