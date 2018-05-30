import java.util.*;

class LRU extends Algorithm{
	
	int[] trame;
	int[] cpage;
	int[] page;
	int pf = 0; 
	int pages;
	int test = 0; 
	int n; 
	int test1 = 0;
	Scanner scan = new Scanner(System.in);
	
	public LRU(int size, int pages) {
	super(size);
	this.n = size;
    this.pages = pages;
	trame = new int[size];
	cpage = new int[size];
	page = new int[pages];
	}
	
	@Override
	public void insert(int Npage) {
		Npage = pages;
		
		for (int i = 0; i < pages; i++) {
			if (i < n) {
				trame[i] = page[i];
				pf++;
				for (int j = 0; j < n; j++)
				System.out.print(trame[j] + "    ");
				System.out.println();
			} else {
				if (verify(page[i]) == -1) {
					int rep = replace(i);
					trame[rep] = page[i];
					pf++;
					for (int j = 0; j < n; j++)
					System.out.print(trame[j] + "    ");
					System.out.println();
				} else {
					for (int j = 0; j < n; j++)
					System.out.print(trame[j] + "    ");
					System.out.println();
				}
			}
		}
		System.out.println("Défaut de page " + pf);
		
	}
	

	void get() {
		System.out.println("Entrer les pages");
		for (int i = 0; i < pages; i++){
			page[i] = scan.nextInt();}
		for (int i = 0; i < n; i++){
			trame[i] = -1;}
	}
	
	int replace(int x) {
		int i;
		for (i = 0; i < n; i++)
			cpage[i] = 0;
		test1 = 0;
		for (i = x - 1; i >= 0; i--) {
			if (verify(page[i]) >= 0) {
				test1++;
				cpage[verify(page[i])] = 1;
			}
			if (test1 == (n - 1))
				break;
		}
		for (i = 0; i < n; i++)
			if (cpage[i] == 0) {
				test1 = i;
				break;
			}
		return i;
	}

	int verify(int x) {
		test = -1;
		for (int i = 0; i < n; i++)
			if (trame[i] == x) {
				test = i;
				break;
			}
		return test;
	}
}


