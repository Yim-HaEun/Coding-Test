import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String,Integer> p = new HashMap<>();
        
        for(int i=0;i<7;i++) {
        	String c =scan.next();
        	int ppl = scan.nextInt();
        	p.put(c, ppl);
        }
        String max = null;
        int maxppl = Integer.MIN_VALUE;
        for(Map.Entry<String, Integer> entry : p.entrySet()){
        	if(entry.getValue() > maxppl) {
        		maxppl = entry.getValue();
        		max = entry.getKey();
        	}
        }
        System.out.println(max);
        scan.close();  
    }  
}