import java.util.Scanner;
public class Decorator {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
		System.out.println("Enter hourly rate: ");
		float hourlyRate = s.nextFloat();
		
		System.out.println("Enter room's area: ");
		int area = s.nextInt();
		
		System.out.println("Enter unit cost materials: ");
		float unitCost = s.nextFloat();
		
		System.out.println("Enter decorating time: ");
		int timeNeeded = s.nextInt();
		
		//create a room
		Room eachRoom = new Room(area, timeNeeded, unitCost);
		//create a job
		Job eachJob = new Job(hourlyRate, eachRoom);
		
		//calculate total cost
		float tC = eachJob.calculateCost();
		
		System.out.println("Total cost is £" + tC);
	}

}
