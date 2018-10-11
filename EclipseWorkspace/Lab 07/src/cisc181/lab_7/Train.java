package cisc181.lab_7;

import java.util.LinkedList;

public class Train {
	
	private LinkedList<TrainCar> trainList;
	
	public Train(){
		trainList = new LinkedList<TrainCar>();
	}
	public LinkedList<TrainCar> getTrainList(){
		return trainList;
	}
	public String getHeadCargo(){
		if(trainList.isEmpty())
			return null;
		return trainList.get(0).getCargo();
	}
	public void attachAtFront(String cargo){
		trainList.addFirst(new TrainCar(cargo));
	}
	public String removeFromFront(){
		if(trainList.isEmpty())
			return null;
		return trainList.removeFirst().toString();
	}
	public void attachAtEnd(String cargo){
		trainList.addLast(new TrainCar(cargo));
	}
	public String removeFromEnd(){
		if(trainList.isEmpty())
			return null;
		return trainList.removeLast().toString();
	}

}
