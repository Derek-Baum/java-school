package cisc181.lab_6;

public class Train {
	
	private TrainCar head; // traincar representing the front of the train
	
	// constructor
	public Train(){
		head = null;
	}
	//accessor method for heads cargo
	public String getHeadCargo(){
		return head.getCargo();
	}
	// accessor method for head
	public TrainCar getHead(){
		return head;
	}
	// mutator that adds a traincar to the front
	// sets head to a new train and sets the new heads next to the old head
	public void attachAtFront(String cargo){
		head = new TrainCar(cargo,head);
	}
	// removes the head from the front of the train and returns its cargo
	// returns null if head does not exist
	public String removeFromFront(){
		String output = head.getCargo();
		head = head.getNext();
		if(output.equals(""))
			return null;
		return output;
	}
	// adds a traincar to the back by looping through the 
	// train and modifying the final traincar(the one that has a null value for getNext()
	
	public void attachAtEnd(String cargo){
		if(head == null){
			head = new TrainCar(cargo,null);
		}else{
			TrainCar storage = head;
			while(storage.getNext() != null){
				storage = storage.getNext();
			}
			
			storage.setNext(new TrainCar(cargo,null));	
		}
	}
	
	// removes the final traincar from the end by attaching all cargos
	// to the end of a new train except for the final cargo and then
	// setting this objects head to that of the Train t.
	// returns the cargo of the train that was removed.s
	
	// null 1 2 3 4 -> null 2 3 4
	public String removeFromEnd(){
		Train t = new Train();
		TrainCar storage = head;
		while(storage.getNext() != null){
			t.attachAtEnd(storage.getCargo());
			storage = storage.getNext();
		}
		head = t.getHead();
		return storage.getCargo();
	}	
}
