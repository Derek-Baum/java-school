package cisc181.binarytetris;

public class BinaryTetrisGameState {
	
	private BinaryTetrisGame game;
	
	public BinaryTetrisGameState(BinaryTetrisGame game){
		this.game = game;
	}

	public String boardToString(){
		String output = "";
		for(int i = 0; i < game.getBoard().length;i++){
			for(int j = 0;j < game.getBoard()[i].length;j++){
				if(game.getBoard()[i][j] == null){
					output += "_";
				}else if(game.getBoard()[i][j].getOn()){
					output += "1";
				}else{
					output += "0";
				}
			}
			output+="\n";
		}
		
		return output;
	}
	
	public String listToString(){
		String output = "{";
		for(int x : game.getGoals()){
			output += x + ", ";
		}
		output = output.substring(0,output.length() - 2);
		output += "}";
		return output;
	}
	
	public String toString(){
		if(game == null){
			return "no game";
		}
		return "Score is: " + game.getScore() + "\nCurrent Goals: " + listToString()
		+ "\nA " + (game.getFalling().getOn() ? 1 : 0) + " is currently falling.\n"
		+ "This is the board.\n" + boardToString();
	}

}
