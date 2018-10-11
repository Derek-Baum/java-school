package cisc181.cp_2;

import cisc181.cp_2.Action;

public class PlacePieceAction implements Action<TicTacToeGame>{
    private char player;
    private int row;
    private int column;
    
    public PlacePieceAction(char player, int row, int column){
        this.player = player;
        this.row = row;
        this.column = column;
    }
    
    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public char getPlayer(){return player;}
    
    /**
     * Placing a piece is only valid if:
     * 1. It is within the bounds of the board
     * 2. and it is the player's turn
     * 3. and it is the "empty" piece at the given row/column
    */
    @Override
    public boolean isValid(TicTacToeGame game) {
        return game.getTicTacToeBoard().isInBounds(row, column) &&
                game.getTurn() == player &&
                game.getTicTacToeBoard().getPiece(row,column).isEmpty();
    }
    @Override
    public void update(TicTacToeGame game) {
        game.setPiece(row, column, new GamePiece(player));
        game.changeTurn();
    }

    public String toString() {
        return "Player " + player + " places piece at "+ row + ","+ column;
    }


}
