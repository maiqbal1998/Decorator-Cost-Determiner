
public class Job {
	float hourlyRate;
	Room theRoom;
	
	
	public Job(float hR, Room r)
	{
		this.hourlyRate = hR;
		this.theRoom = r;
	}
	
	public float calculateCost() {
		float totalCost = theRoom.calculateCost(hourlyRate);
		return totalCost;
	}
}
