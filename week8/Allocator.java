package week8;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Allocator {

	private final byte LIFT_ASSIGN = 1;
	private final byte MAINTENANCE=2;
	private final byte EXIT = 0;
	private Scanner scanner = new Scanner(System.in);
	private List<Lift> lifts = new LinkedList<>();

	public void init() {
		add();
		System.out.println("\n "+LIFT_ASSIGN+" -> Lift Assign\n "+MAINTENANCE+" -> Maintenance\n "+EXIT+" -> Exit");
		System.out.print(" Enter choice: ");
		byte choice = scanner.nextByte();
		System.out.println();

		if (choice == LIFT_ASSIGN) {
			allocate();
		}else if(choice == MAINTENANCE) {
			onMaintenance();
		}else if (choice == EXIT) {
			System.exit(0);
		} else {
			System.out.println("Invalid choice, Enter valid option");
		}
	}

	public void allocate() {
		display(lifts);
		System.out.print("\n\nEnter Current Floor: ");
		int currFloor=scanner.nextInt();
		System.out.print("Enter Destination Floor: ");
		int destFloor=scanner.nextInt();
		int minDistance=Integer.MAX_VALUE;
		int index=-1;
		int currPostion=-1;
		
		for(int i=0;i<lifts.size();i++) {
			currPostion=lifts.get(i).getCurrentPosition();
			
			if(lifts.get(i).getCurrentPosition()!=-1) {
				if(minDistance==Math.abs(currPostion-currFloor)) {
					if( (currFloor>destFloor) && (currPostion>currFloor)) {
						index=i;
					}
				}
				
				else if(minDistance>Math.abs(lifts.get(i).getCurrentPosition()-currFloor)) {
					minDistance=Math.abs(currPostion-currFloor);
					index=i;
				}
			}
			
		}
		
		if(index>=0) {
			System.out.println("\nL"+(index+1)+" is assigned :)");
			lifts.get(index).setCurrentPosition(destFloor);
		}
		else {
			System.out.println("\nNo lift assigned :(");
		}
		
		init();
		
	}

	public void onMaintenance() {
		display(lifts);
		System.out.print("\nEnter a lift number: ");
		int number=scanner.nextInt();
		if(number>0 && number<=5) {
			lifts.get(number-1).setCurrentPosition(-1);
		}
		else {
			System.out.println("No lift fount!");
		}
		init();
	}
	public void add() {
		if (lifts.size() == 0) {
			for (int i = 1; i <= 5; i++) {
				lifts.add(new Lift(i));
			}
		}
	}

	public void display(List<Lift> lifts) {
		System.out.print("Lift:");
		for (int i = 1; i <= lifts.size(); i++) {
			System.out.print(" L" + i);
		}
		System.out.print("\nFloor:");
		for (Lift lift : lifts) {
			if(lift.getCurrentPosition()==-1) {
				System.err.print(" " + lift.getCurrentPosition() + " ");
			}
			else {
				System.out.print(" " + lift.getCurrentPosition() + " ");
			}
		}
	}
}
