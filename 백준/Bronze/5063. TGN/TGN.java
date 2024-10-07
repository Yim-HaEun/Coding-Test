import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //r=광고x수익/e=광고후 수익/c=광고비용
        for(int i=0;i<n;i++) {
        	int r = scan.nextInt();
        	int e = scan.nextInt();
        	int c =scan.nextInt();
        	if(r==(e-c)) {
        		System.out.println("does not matter");
        	}else if(r>(e-c)) {
        		System.out.println("do not advertise");
        	}else {
        		System.out.println("advertise");
        	}
        }
        scan.close();
    }
}