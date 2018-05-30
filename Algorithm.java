public abstract class Algorithm
{
	protected int framenum;
	protected int pagedef; 		
	
	public Algorithm(int pfc) {
		if (pfc < 0)
			throw new IllegalArgumentException();
		this.framenum = pfc;
		pagedef = 0;
	}
	public int pagesDef() {
		return pagedef;
	}
	public abstract void insert(int pageNumber); 
}
