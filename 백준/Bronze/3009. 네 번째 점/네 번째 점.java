import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<Integer,Integer> countx = new HashMap<>();
        Map<Integer,Integer> county = new HashMap<>();
       
        for(int i=0;i<3;i++) {
    	   int x = scan.nextInt();
    	   countx.put(x, countx.getOrDefault(x, 0)+1);
    	   int y = scan.nextInt();
    	   county.put(y, county.getOrDefault(y, 0)+1);
        	
        }//중복되지않은 x
        for(Map.Entry<Integer, Integer> entry : countx.entrySet()) {
        	if(entry.getValue()==1) {
        		System.out.print(entry.getKey() + " ");
        		break;
        	}
        }for(Map.Entry<Integer, Integer> entry : county.entrySet()) {
        	if(entry.getValue()==1) {
        		System.out.println(entry.getKey());
        		break;
        	}
        }
        
        scan.close();
    }
}
