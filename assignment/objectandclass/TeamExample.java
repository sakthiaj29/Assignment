package assignment.objectandclass;

import java.util.List;

public class TeamExample{
	public static void main(String[] args) {
		Team team = new Team("CSK", "Chennai", "IPL");
		System.out.println(team);
		team.playGame();
		team.hireCoach();
		Player player=new Player("Dhoni", "Batting", 7);
		System.out.println(player);
		
	}
}
class Team{

	public String name;
	public String city;
	public String division;
	public List<Player> playerList;
	
	public Team(String name, String city, String division) {
		this.name=name;
		this.city=city;
		this.division=division;
	}
	public void playGame() {
		System.out.println("\n"+name+" playing...");
	}

	public void hireCoach() {
		System.out.println("\n"+name+" is hiring a coach...");
	}
	
	public String toString() {
		return "\nTeam name:"+name+"\nCity:"+city+"\nDivision:"+division;
	}

}

class Player {

	public String name;
	public String position;
	public int jerseyNumber;
	public Team team;
	
	public Player(String name, String position, int jerseyNumber) {
		this.name=name;
		this.position=position;
		this.jerseyNumber=jerseyNumber;
	}

	public void playGame() {
		System.out.println("\n"+name+" playing...");
	}

	public void train() {
		System.out.println("\n"+name+" training...");
	}
	public String toString() {
		return "\nPlayer name:"+name+"\nPosition:"+position+"\nJerseyNumber:"+jerseyNumber;
	}
}
