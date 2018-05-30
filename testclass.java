import java.util.Scanner;


public class testclass {

	public static final int MAXP = 9;

	public static void main(String[] args) {
		
		Algorithm fifo = null;
		Algorithm lru = null;
		int page_max = MAXP;
		int[] adrS;
		int size;
		int pagefrmax;
		Page ref = null;
		Scanner scan = new Scanner(System.in);
			
		
		System.out.println("Entrer taille réf: ");
		size = scan.nextInt();  
		
		System.out.println("Entrer nombre de page max: ");
		pagefrmax = scan.nextInt();
		
		System.out.println("Entrer nombre de pages: ");
		page_max =  scan.nextInt();
		
		System.out.println();
		
		ref = new Page(size, page_max);
		lru = new LRU(size, pagefrmax);
		fifo = new FIFO(pagefrmax);
		adrS = ref.getRef();
		
		
		for (int i = 0; i < adrS.length; i++) { 
			fifo.insert(adrS[i]);
		}
		
		for (int i = 0; i < adrS.length; i++) { 
			lru.insert(adrS[i]);
		}
		
		System.out.println("LRU défauts: " + lru.pagesDef());
		System.out.println();
		System.out.println("FIFO défauts: " + fifo.pagesDef());
	}
}
