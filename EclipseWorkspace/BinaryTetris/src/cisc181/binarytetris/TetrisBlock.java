package cisc181.binarytetris;

public class TetrisBlock {
	
	private boolean on;
	private Position p;
	
	public TetrisBlock(boolean on,Position p){
		this.on = on;
		this.p = p;
	}
	
	public boolean getOn(){
		return on;
	}
	public Position getPos(){
		return p;
	}
	
	public String toString(){
		return "" + on;
	}

}
