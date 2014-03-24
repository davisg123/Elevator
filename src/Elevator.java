
public class Elevator extends AbstractElevator{
	protected int numFloors; 
	protected int elevatorId;
	protected int maxOccupancyThreshold;

	public Elevator(int numFloors, int elevatorId, int maxOccupancyThreshold){
		super(numFloors,elevatorId,maxOccupancyThreshold);
		this.numFloors = numFloors;
		this.elevatorId = elevatorId;
		this.maxOccupancyThreshold = maxOccupancyThreshold;
	}
	
	public void OpenDoors(){
		
	}
	public void ClosedDoors(){
		
	}
	public boolean Enter(){
		return false;
	}
	public void Exit(){
		
	}
	public void RequestFloor(int floor){
		
	}
	public void VisitFloor(int floor){
		
	}
}
