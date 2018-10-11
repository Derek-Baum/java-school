package cisc181.lab_7;

public class TrainCar {
	private String cargo;
	
	public TrainCar(String cargo){
		this.cargo = cargo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String toString(){
		return cargo;
	}
	

}
