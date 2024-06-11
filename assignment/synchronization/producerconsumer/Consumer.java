package assignment.synchronization.producerconsumer;

class Consumer implements Runnable {
    private Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int loop = 0; loop < 10; loop++) { 
            buffer.get();
            try {
                Thread.sleep((long) (Math.random() * 1000)); 
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
