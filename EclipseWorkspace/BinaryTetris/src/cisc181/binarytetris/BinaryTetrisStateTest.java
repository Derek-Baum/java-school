package cisc181.binarytetris;

import java.util.ArrayList;

public class BinaryTetrisStateTest {
	
	public static void main(String[] args){
		ArrayList<Integer> goals = new ArrayList<Integer>();
		goals.add(9);
		goals.add(13);
		goals.add(21);
		BinaryTetrisGame game = new BinaryTetrisGame(new TetrisBlock(true,new Position(0,0)), 0, goals);
		
		
		BinaryTetrisGameState state = new BinaryTetrisGameState(game);
		
		System.out.println("----- BEGINNING STATE -----");
		
		System.out.println(state);
		
		TetrisBlock[][] board = new TetrisBlock[10][8];
		for(int i = 0; i < 8; i++){
			board[9][i] = new TetrisBlock(Math.random() > 0.5, new Position(9,i));
		}
		
		game.setBoard(board);
		
		
		System.out.println("----- IN THE MIDDLE STATE -----");
		System.out.println(state);
		
		
		
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 8; j++){
				board[i][j] = new TetrisBlock(Math.random() > 0.5, new Position(i,j));
			}
		}
		game.setBoard(board);
		game.addToScore(213);
		System.out.println("----- ENDING STATE -----");
		System.out.println(state);
		
	}

}
