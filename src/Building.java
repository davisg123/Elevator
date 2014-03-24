
public class Building extends AbstractBuilding {
	protected int numFloors;
	protected int numElevators;

	public Building(int numFloors, int numElevators) {
		super(numFloors,numElevators);
		this.numFloors = numFloors;
		this.numElevators = numElevators;
	}

	public Elevator CallDown(int fromFloor){
		
	}
	
	public Elevator CallUp(int fromFloor){
		
	}
}
