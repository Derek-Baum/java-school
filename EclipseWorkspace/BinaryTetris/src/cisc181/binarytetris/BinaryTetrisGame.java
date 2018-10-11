package cisc181.binarytetris;

import java.util.ArrayList;

public class BinaryTetrisGame extends Game{
	
	private TetrisBlock[][] board;  //We may have the game have varying sizes, but for now it will only be 10x8
	private TetrisBlock falling;
	private int score;
	private ArrayList<Integer> goals;	
	
	public BinaryTetrisGame(TetrisBlock falling, int score, ArrayList<Integer> goals){
		this.falling = falling;
		this.score = score;
		this.goals = goals;
		
		board = new TetrisBlock[10][8];
		
		board[falling.getPos().getX()][falling.getPos().getY()] = falling;
	}

	public TetrisBlock[][] getBoard() {
		return board;
	}
	
	public void setBoard(TetrisBlock[][] board){
		this.board = board;
	}

	public TetrisBlock getFalling() {
		return falling;
	}
	
	public void setFalling(TetrisBlock falling){
		this.falling = falling;
	}

	public int getScore() {
		return score;
	}
	public void addToScore(int toAdd){
		score += toAdd;
	}

	public ArrayList<Integer> getGoals() {
		return goals;
	}
	public void setGoals(ArrayList<Integer> goals) { 
		this.goals = goals;
	}

	@Override
	public boolean isEnd() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
}
