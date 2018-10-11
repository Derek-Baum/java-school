package cisc181.lab_6;

public class GameBoard {
	
	private GamePiece[][] board; // 2d array of gamepieces
	
	//constructor
	public GameBoard(GamePiece[][] board){
		this.board = board;
	}
	//accessor method for the 2d array board
	public GamePiece[][] getBoard(){
		return board;
	}
	// mutator method changes the board at the specified row and column to the specified gamepiece
	public void setPiece(int row, int column,GamePiece piece){
		board[row][column] = piece;
	}
	//returns true if atleast one spot in the board is empty
	public boolean hasEmptySpace(){
		for(GamePiece[] row : board){
			for(GamePiece p : row){
				if(p.isEmpty())
					return true;
			}
		}
		return false;
	}
	//returns true if the row and column are valid board locations
	public boolean isInBounds(int row, int column){
		return board.length > row && board[0].length > column;
	}
	
	//prints a representation of the board.
	public void printBoard(){
		for(GamePiece[] row : board){
			for(GamePiece p : row){
				System.out.print("" + p + " ");
			}
			System.out.println();
		}
	}

}
