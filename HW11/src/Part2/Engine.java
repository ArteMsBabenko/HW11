package Part2;

public class Engine {

	private int NumberOfCylinders;
	
	public Engine(int NumberOfCylinders) {
		this.NumberOfCylinders = NumberOfCylinders;
	}

	public int getNumberOfCylinders() {
		return NumberOfCylinders;
	}

	@Override
	public String toString() {
		return "Engine [NumberOfCylinders=" + NumberOfCylinders + "]";
	}

}
