package week8;

public class Main {

	public static Main main;
	
	public static Main getInstance() {
		if(main==null) {
			main=new Main();
		}
		return main;
	}
	
	void start() {
		
		new Allocator().init();
	}
	
	public static void main(String[] args) {
		
		Main.getInstance().start();
		
	}
}
