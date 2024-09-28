import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	int n = scan.nextInt();
    	scan.nextLine();
    	for(int i=0;i<n;i++) {
    		String num = scan.nextLine();
    		String[] ab = num.split(","); 
    		int sum =0;
    		for(String s : ab) {
    			sum+=Integer.parseInt(s.trim());
    		}
    		System.out.println(sum);
    	}
    	scan.close();
    }
}