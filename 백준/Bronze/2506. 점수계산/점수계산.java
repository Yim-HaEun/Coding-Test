import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int total=0;
        int a = 0;//1 연속 
        for(int i=0;i<n;i++) {
        	int score = scan.nextInt();
        	if(score==1) {
        		a++;
        		total+=a;
        		
        	}else{
        		a=0;
        	}
        }
        System.out.println(total);
 
        scan.close();
    }
}