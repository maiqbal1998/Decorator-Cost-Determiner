
class TiledRoom extends Room {
	
	int grouting;
	
	TiledRoom(int area, int timeToComplete, float unitCostMaterial, int grouting) {
		super(area, timeToComplete, unitCostMaterial);
		this.grouting = grouting;
	}
}
