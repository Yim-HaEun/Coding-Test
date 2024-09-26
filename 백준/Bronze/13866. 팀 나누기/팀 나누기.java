import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();//고기온도
        int b = scan.nextInt();//목표온도
        int c = scan.nextInt();//얼어있는 고기1도 데우는 데 걸리는 시간 
        int d = scan.nextInt();//해동 시간
        int n1 = (d-c);
        int n2 = (b-a);
        if(n1>=n2) {
        	System.out.println(n1-n2);
        }else {
        	System.out.println(n2-n1);
        }
       
        scan.close();
    }  
}