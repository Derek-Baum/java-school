package cisc181.cp_2;



public class GamePiece {


    public static final char EMPTY = 'E';

    private char symbol;

    public GamePiece(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    public boolean isEmpty() {
        return symbol == EMPTY;
    }

    public String toString() {
        return Character.toString(symbol);
    }

    public boolean equals(GamePiece otherPiece) {
        return this.symbol == otherPiece.getSymbol();
    }

}
