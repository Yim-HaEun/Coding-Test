import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	for(int i=0;i<3;i++) {
    		int back=0;
    		int front=0;
    		for(int j=0;j<4;j++) {
    			int a = scan.nextInt();
    			if(a==0) {
    				front+=1;
    			}else if(a==1) {
    				back+=1;
    			}
    		}
    		if(front==4) {
    			System.out.println("D");
    		}else if(back==4) {
    			System.out.println("E");
    		}else if(front==3) {
    			System.out.println("C");
    		}else if(front==2) {
    			System.out.println("B");
    		}else if(front ==1) {
    			System.out.println("A");
    		}
    	}
    	scan.close();
    }
}