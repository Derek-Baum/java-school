package cisc181.lab_6;

import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {


    @Test
    public void test_GamePiece() {
        System.out.println("Testing GamePiece");
        GamePiece x = new GamePiece('X');
        GamePiece x2 = new GamePiece('X');
        GamePiece o = new GamePiece('O');

        GamePiece blank = new GamePiece(' ');

        assertEquals(x.getSymbol() == 'X', true);
        assertEquals(o.getSymbol() == 'O', true);
        assertEquals(blank.getSymbol() == GamePiece.EMPTY, true);
        assertEquals(blank.isEmpty(), true);
        assertEquals(x.isEmpty(), false);
        assertEquals(x.toString().equals("X"), true);
        assertEquals(x.equals(o), false);
        assertEquals(x.equals(blank), false);
        assertEquals(x.equals(x2), true);

    }

    @Test
    public void test_GameBoard() {
        System.out.println("Testing GameBoard");
        GamePiece x = new GamePiece('X');
        GamePiece o = new GamePiece('O');
        GamePiece blank = new GamePiece(' ');


        GameBoard board = new GameBoard(new GamePiece[][]{
                {blank, blank, blank},
                {blank, blank, blank},
                {blank, blank, blank}});

        board.setPiece(0, 0, x);
        board.setPiece(0, 1, o);
        board.setPiece(0, 2, x);
        board.setPiece(1, 0, o);
        board.setPiece(1, 1, x);
        board.setPiece(1, 2, o);
        board.setPiece(2, 0, x);
        board.setPiece(2, 1, o);
        assertEquals(board.hasEmptySpace(), true);
        board.setPiece(2, 2, x);
        assertEquals(board.hasEmptySpace(), false);

        assertEquals(board.isInBounds(0, 2), true);
        assertEquals(board.isInBounds(3, 2), false);

        GamePiece[][] ticTacToe = board.getBoard();
        assertEquals(ticTacToe[0][0].equals(x), true);
        assertEquals(ticTacToe[0][1].equals(o), true);
        assertEquals(ticTacToe[0][2].equals(x), true);
        assertEquals(ticTacToe[1][0].equals(o), true);
        assertEquals(ticTacToe[1][1].equals(x), true);
        assertEquals(ticTacToe[1][2].equals(o), true);
        assertEquals(ticTacToe[2][0].equals(x), true);
        assertEquals(ticTacToe[2][1].equals(o), true);
        assertEquals(ticTacToe[2][2].equals(x), true);

        board.printBoard();

    }
}