import java.util.Scanner;


public class inputLRU {

	
	
		public static void main(String arg[]) {
			Scanner scan = new Scanner(System.in);
			System.out.print("LRU - Enter frame size:");
			int n = scan.nextInt();
			System.out.print("Enter no of pages:");
			int p = scan.nextInt();
			LRU elem = new LRU(n,p);
			elem.get();
			elem.insert(p);
		}
	
}
