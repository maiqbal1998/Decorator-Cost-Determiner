
public class Room {
	int area;
	int timeToComplete;
	float unitCostMaterial;
	
	public Room (int A, int T, float U) {
		this.area = A;
		this.timeToComplete = T;
		this.unitCostMaterial  = U;
	}
	
	public float calculateCost(float hourlyRate){
		float a = area*unitCostMaterial;
		float b = timeToComplete*hourlyRate;
		float totalCost = a + b;
		return totalCost;
		
	}
}
