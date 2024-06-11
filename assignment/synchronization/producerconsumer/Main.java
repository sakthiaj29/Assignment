package assignment.synchronization.producerconsumer;

public class Main {

	public static void main(String[] args) {
		Buffer buffer = new Buffer();
	      
        Thread producerThread1 = new Thread(new Producer(buffer));
        Thread producerThread2 = new Thread(new Producer(buffer));
        Thread consumerThread1 = new Thread(new Consumer(buffer));
        Thread consumerThread2 = new Thread(new Consumer(buffer));
        
        producerThread1.start();
        producerThread2.start();
        consumerThread1.start();
        consumerThread2.start();
	}
}
