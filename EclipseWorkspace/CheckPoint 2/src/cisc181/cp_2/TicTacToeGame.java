package cisc181.cp_2;

import cisc181.cp_2.Game;

public class TicTacToeGame extends Game{

    private GameBoard ticTacToeBoard;
    private char turn;
    private char notTurn;

    public TicTacToeGame(char turn, char notTurn){
        GamePiece E = new GamePiece(GamePiece.EMPTY);
        this.ticTacToeBoard = new GameBoard(new GamePiece[][]{
                {E,E,E},
                {E,E,E},
                {E,E,E} });
        this.turn = turn;
        this.notTurn = notTurn;
    }

    public GameBoard getTicTacToeBoard(){
        return  ticTacToeBoard;
    }

    public char getTurn(){
        return  turn;
    }

    public char getNotTurn(){
        return  notTurn;
    }

    public void changeTurn() {
        char current = turn;
        turn = notTurn;
        notTurn = current;
    }

    public void setPiece(int row, int column, GamePiece piece) {
        ticTacToeBoard.setPiece(row,column,piece);
    }

    public boolean isEnd() {
        return !ticTacToeBoard.hasEmptySpace() || isWinner(turn) || isWinner(notTurn);
    }

    
    // Player wins if 3 in a row
    public boolean isWinner(char symbol) {
        return getScore(symbol) == 3;
    }

    public int getScore(char symbol){
        return ticTacToeBoard.getMaxConsecutive(symbol);
    }

    public String getStatus() {
        if (isEnd()) {
                if (isWinner(getTurn())) {
                    return "Player " + getTurn() + " wins!\n";
                }
                else if (isWinner(getNotTurn())) {
                    return "Player " + getNotTurn() + " wins!\n";
                }
                else {
                    return "It is a draw.\n";
                }
        }
        else {
            return "Player " + turn + "'s turn\n";
        }
    }

	@Override
	public String toString() {
		String output = ticTacToeBoard.toString();
		output+="\n" + getStatus();
		return output;
	}
}
