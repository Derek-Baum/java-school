package cisc181.cp_2;

import java.util.Arrays;
import org.junit.Test;

import static org.junit.Assert.*;

public class TicTacToeGameTest {


    @Test
    public void test_Game() {
        System.out.println("Testing Game\n");

        TicTacToeGame game = new TicTacToeGame('X', 'O');
        game.start();

        // This tests the toString() method of the TicTacToeGame
        System.out.println(game);


        //Create an Action
        PlacePieceAction action1 = new PlacePieceAction('X', 0, 1);
        assertTrue(action1.isValid(game)); // it is x's turn so an update should occur
        System.out.println(action1.toString() + '\n');
        //Perform the Action
        game.perform(action1);
        //Display the game
        System.out.println(game);

        //Create an Action
        PlacePieceAction action2 = new PlacePieceAction('O', 2, 0);
        assertTrue(action2.isValid(game)); // it is o's turn so an update should occur
        System.out.println(action2.toString() + '\n');
        //Perform the Action
        game.perform(action2);
        //Display the game
        System.out.println(game);

        //Create an Action
        PlacePieceAction action3 = new PlacePieceAction('X', 0, 0);
        assertTrue(action3.isValid(game)); // it is x's turn so an update should occur
        System.out.println(action3.toString() + '\n');
        //Perform the Action
        game.perform(action3);
        //Display the game
        System.out.println(game);

        //Create an Action
        PlacePieceAction action4 = new PlacePieceAction('O', 0, 2);
        assertTrue(action4.isValid(game)); // it is o's turn so an update should occur
        System.out.println(action4.toString() + '\n');
        //Perform the Action
        game.perform(action4);
        //Display the game
        System.out.println(game);

        //Create an Action
        PlacePieceAction action5 = new PlacePieceAction('X', 1, 1);
        assertTrue(action5.isValid(game)); // it is x's turn so an update should occur
        System.out.println(action5.toString() + '\n');
        //Perform the Action
        game.perform(action5);
        //Display the game
        System.out.println(game);

        //Create an Action
        PlacePieceAction action6 = new PlacePieceAction('O', 2, 1);
        assertTrue(action6.isValid(game)); // it is o's turn so an update should occur
        System.out.println(action6.toString() + '\n');
        //Perform the Action
        game.perform(action6);
        //Display the game
        System.out.println(game);

        //Create an Action
        PlacePieceAction action7 = new PlacePieceAction('X', 2, 2);
        assertTrue(action7.isValid(game)); // it is x's turn so an update should occur
        System.out.println(action7.toString() + '\n');
        //Perform the Action
        game.perform(action7);
        //Display the game
        System.out.println(game);
        
        System.out.println("STARTING NEW GAME ::::");
        
        TicTacToeGame game2 = new TicTacToeGame('X', 'O');
        game2.start();
        
        PlacePieceAction myAction1 = new PlacePieceAction('X', 0, 0);
        assertTrue(myAction1.isValid(game2));
        System.out.println(myAction1.toString() + "\n");
        game2.perform(myAction1);
        System.out.println(game2);
        
        PlacePieceAction myAction2 = new PlacePieceAction('O', 1, 1);
        assertTrue(myAction2.isValid(game2));
        System.out.println(myAction2.toString() + "\n");
        game2.perform(myAction2);
        System.out.println(game2);
        
        PlacePieceAction myAction3 = new PlacePieceAction('X', 0, 1);
        assertTrue(myAction3.isValid(game2));
        System.out.println(myAction3.toString() + "\n");
        game2.perform(myAction3);
        System.out.println(game2);
        
        PlacePieceAction myAction4 = new PlacePieceAction('O', 2, 2);
        assertTrue(myAction4.isValid(game2));
        System.out.println(myAction4.toString() + "\n");
        game2.perform(myAction4);
        System.out.println(game2);
        
        PlacePieceAction myAction5 = new PlacePieceAction('X', 0, 2);
        assertTrue(myAction5.isValid(game2));
        System.out.println(myAction5.toString() + "\n");
        game2.perform(myAction5);
        System.out.println(game2);

}
}

