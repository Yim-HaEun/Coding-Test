import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	int[][] arr= new int[9][9];
    	int a=0;
    	int b=0;
    	for(int i=0;i<9;i++) {
    		for(int j=0;j<9;j++) {
    			arr[i][j] =scan.nextInt();
    		}
    	}
    	int max = arr[0][0];
    	for(int i=0;i<9;i++) {
    		for(int j=0;j<9;j++) {
    			if(arr[i][j]>max) {
    				max=arr[i][j];
    				a=i;
    				b=j;
    			}
    		}
    	}
    	System.out.println(max);
    	System.out.printf("%d %d",a+1,b+1);
    	scan.close();
    }
}