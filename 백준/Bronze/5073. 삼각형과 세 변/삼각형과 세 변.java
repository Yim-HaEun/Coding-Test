import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	while(true) {
    		int num[] = new int[3];
        	for(int i=0;i<3;i++) {
        		num[i] = scan.nextInt();
        	}
        	Arrays.sort(num); //오름차순 정렬
    		if(num[0]==0&&num[1]==0&&num[2]==0) { //종료
    			break;
    		}else {
    			//세변이 같을때,
            	if(num[0]==num[1]&&num[0]==num[2]) {
            		System.out.println("Equilateral");
            	//두변의길이가 같으면서 삼각형 조건 만족 a+b>=c
            	}else if((num[0]==num[1]||num[1]==num[2])&&(num[0]+num[1])>num[2]){
            		System.out.println("Isosceles");
            	}else if((num[0]+num[1])>num[2]&&(num[0]!=num[1]&&num[0]!=num[2]&&num[1]!=num[2])){//삼각형 조건o && 세변의 길이가 모두 다름
            			System.out.println("Scalene");
            		}else {
            			System.out.println("Invalid");
            	}
    		}
    	}
    	scan.close();
    }
}