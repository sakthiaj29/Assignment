package assignment.interfaceandpackage.playableinterface;

import java.util.Scanner;

public class PlayableInterfaceMain {

	private Playable playable;
	private Scanner scanner = new Scanner(System.in);

	void playOption(Playable playable) {

		System.out.println("\n 1 -> Play ▶\n 2 -> Pause ⏸\n 3 -> Stop ⏹\n 0 -> Exit");
		System.out.print("\n Enter your option: ");
		byte option = scanner.nextByte();
		System.out.println();
		
		if (option == 1) {

			playable.play();

		} else if (option == 2) {

			playable.pause();

		} else if (option == 3) {

			playable.stop();

		} else if (option == 0) {
			return;
		} else {
			System.out.println("Invalid option, please choice valid option.");
			playerOption();
		}
		
	}

	public void playerOption() {

		System.out.println("\n 1 -> MP3Player 📻 \n 2 -> CDPlayer 💿\n 3 -> StreamingPlayer 📱\n 0 -> Exit");
		System.out.print("\n Enter your option: ");
		byte option = scanner.nextByte();

		if (option == 1) {

			playable = new MP3Player();
			playOption(playable);

		} else if (option == 2) {

			playable = new CDPlayer();
			playOption(playable);

		} else if (option == 3) {

			playable = new StreamingPlayer();
			playOption(playable);

		} else if (option == 0) {
			return;
		} else {
			System.out.println("Invalid option, please choice valid option.");
			playerOption();
		}
	}

	public static void main(String[] args) {

		PlayableInterfaceMain playableInterface = new PlayableInterfaceMain();

		playableInterface.playerOption();

	}

}
