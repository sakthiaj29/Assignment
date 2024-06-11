package assignment.synchronization.resource;

public class Main {
	
	public static void main(String[] args) {
        ResourceA resourceA = new ResourceA();
        ResourceB resourceB = new ResourceB();

        Thread thread1 = new Thread(() -> {
            resourceA.methodA(resourceB);
        }, "T-1");
       Thread thread2 = new Thread(() -> {
            resourceB.methodB(resourceA);
        }, "T-2");
       
        thread1.start();
        thread2.start();
    }

}
