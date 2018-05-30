
public class Page {
	private static final int DEF_SIZE = 100;
	private static final int RSEED = 77;
	int[] refs;

	public Page() {
		this(DEF_SIZE, testclass.MAXP);
	}

	public Page(int c, int maxp) {
		java.util.Random random = null;
		
		if (RSEED == 0)
			random = new java.util.Random();
		if (c < 0)
			throw new IllegalArgumentException();
		else
			random = new java.util.Random(RSEED);
		refs = new int[c];
		for (int i = 0; i < c; i++)
			refs[i] = random.nextInt(maxp + 1);
	}

	public int[] getRef() {
		return refs;
	}
}