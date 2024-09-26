import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();//고기온도
        int b = scan.nextInt();//목표온도
        int c = scan.nextInt();//얼어있는 고기1도 데우는 데 걸리는 시간 
        int d = scan.nextInt();//해동 시간
        int e = scan.nextInt();//얼어있지 않은 고기를 데우는데 걸리는 시간 
        int time = 0;
        if(a<0) {
        	int a1= Math.abs(a);
            time+=a1*c;
            time+=d;
            time+=(b*e);
        }else {
        	int a1 = b-a;
        	
        	time+=(a1*e);
        }

        System.out.println(time);      
        scan.close();
    }  
}