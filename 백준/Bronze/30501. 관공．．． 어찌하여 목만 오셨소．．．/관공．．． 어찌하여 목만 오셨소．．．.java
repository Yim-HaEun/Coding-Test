import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int times = scan.nextInt();
        scan.nextLine();
        for(int i=0;i<times;i++) {
        	String str = scan.nextLine();
        	if(str.contains("S")) {
        		System.out.println(str);
        	}
        }

        scan.close();  
    }  
}