package cisc181.lab_7;

import org.junit.Test;
import static org.junit.Assert.*;


public class TrainTest {

    @Test
    public void test_TrainCar() {
        System.out.println("Testing TrainCar");
        TrainCar trainCar = new TrainCar("bananas");
        assertEquals(trainCar.getCargo(),"bananas");
        trainCar.setCargo("apples");
        assertEquals(trainCar.getCargo(),"apples");
    }

    @Test
    public void test_Train() {

        System.out.println("Testing Train");

        Train cargoTrain = new Train();

        cargoTrain.attachAtFront("coal");
        assertEquals(cargoTrain.getHeadCargo().equals("coal"),true);

        cargoTrain.attachAtFront("bananas");
        assertEquals(cargoTrain.getHeadCargo().equals("bananas"),true);

        cargoTrain.attachAtEnd("lumber");
        cargoTrain.attachAtEnd("apples");


        //in the lab I was told to name this method 'getTrainList()' so I am going to modify the 
        // test case.
//        assertEquals(cargoTrain.getTrain().get(2).getCargo(), "lumber" );
//        assertEquals(cargoTrain.getTrain().get(3).getCargo(), "apples" );
        
        assertEquals(cargoTrain.getTrainList().get(2).getCargo(), "lumber" );
        assertEquals(cargoTrain.getTrainList().get(3).getCargo(), "apples" );

        assertEquals(cargoTrain.removeFromFront().equals("bananas"),true);
        assertEquals(cargoTrain.removeFromFront().equals("coal"),true);

        assertEquals(cargoTrain.removeFromEnd().equals("apples"),true);
        assertEquals(cargoTrain.removeFromEnd().equals("lumber"),true);

        // Train List is empty so if they fail you need to check for an empty list in your
        // remove methods
        assertNull(cargoTrain.removeFromFront());
        assertNull(cargoTrain.removeFromEnd());
        assertNull(cargoTrain.getHeadCargo());

        // add more TrainCars to your Train and  add Test cases to remove them

        cargoTrain.attachAtFront("one");
        cargoTrain.attachAtFront("two");
        cargoTrain.attachAtFront("three");
        
        cargoTrain.attachAtEnd("ONE");
        cargoTrain.attachAtEnd("TWO");
        cargoTrain.attachAtEnd("THREE");
        
        assertEquals(cargoTrain.removeFromFront().equals("three"),true);
        assertEquals(cargoTrain.removeFromFront().equals("two"),true);
        assertEquals(cargoTrain.removeFromFront().equals("one"),true);
        
        assertEquals(cargoTrain.removeFromEnd().equals("THREE"),true);
        assertEquals(cargoTrain.removeFromEnd().equals("TWO"),true);
        assertEquals(cargoTrain.removeFromEnd().equals("ONE"),true);

        
    }

}