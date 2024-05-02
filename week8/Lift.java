package week8;

public class Lift {

	int number;
	int currentPosition;
	int capacity;
	
	
	Lift(int number){
		this.number=number;
	}
	
	public int getNumber() {
		return number;
	}
	
	public int getCurrentPosition() {
		return currentPosition;
	}
	
	public void setCurrentPosition(int currentPosition) {
		this.currentPosition = currentPosition;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
}
