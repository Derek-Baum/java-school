package cisc181.lab_6;

public class TrainCar {
	
	private String cargo; // what the train is carrying
	private TrainCar next; // the next train car in the train

	
	//constructor
	public TrainCar(String cargo, TrainCar next){
		this.cargo = cargo;
		this.next = next;
	}
	// accessor method for cargo
	public String getCargo() {
		return cargo;
	}
	// accessor method for next traincar
	public TrainCar getNext() {
		return next;
	}

	// mutator method for cargo
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	// mutator method for next traincar
	public void setNext(TrainCar next) {
		this.next = next;
	}
	// toString override method returns the cargo.
	public String toString(){
		return cargo;
	}
	
	
}
