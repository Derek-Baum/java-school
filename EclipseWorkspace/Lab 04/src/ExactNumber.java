
public class ExactNumber {

	private static final long DENOMINATOR = 10000000000000000L;
	private long left;
	private long right;
	
	public ExactNumber(long left,long right){
		this.left = left;
		this.right = right;
	}
	public double doubleValue(){
		return (double)left + (double)right/(double)DENOMINATOR;
	}
	public long getLeft(){
		return left;
	}
	public long getRight(){
		return right;
	}
	public boolean equals(ExactNumber e){
		return (e.getLeft() == left) && (e.getRight() == right);
	}
	public int compareTo(ExactNumber e){
		if(e.getLeft() == left)
			return (right > e.getRight() ? 1 : (right < e.getRight() ? -1 : 0));
		
		return (left > e.getLeft() ? 1 : (left < e.getLeft() ? -1 : 0));
		
	}
	public ExactNumber add(ExactNumber e){
		boolean bigRight = (right+e.getRight()) > DENOMINATOR;
		return new ExactNumber ((left + e.getLeft()) + (bigRight ? 1 : 0), right + e.getRight() - (bigRight ? DENOMINATOR : 0));
	}
	public String toString(){
		return "" + doubleValue();
	}
}
