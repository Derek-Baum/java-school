package cisc181.lab_6;

public class GamePiece {
	
	public static final char EMPTY = ' '; // static empty character
	
	private char symbol; // symbol of the gamepiece
	//constructor
	public GamePiece(char symbol){
		this.symbol = symbol;
	}
	//accessor method for symbol
	public char getSymbol(){
		return symbol;
	}
	//returns true if the symbol is the empty character
	public boolean isEmpty(){
		return symbol == EMPTY;
	}
	// toString override method
	public String toString(){
		return "" + symbol;
	}
	/// equals override returns true if the symbols are equal.
	public boolean equals(GamePiece p){
		return symbol == p.symbol;
	}

}
