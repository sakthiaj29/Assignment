package assignment.synchronization.producerconsumer;

class Producer implements Runnable {
    private Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int loop = 0; loop < 10; loop++) { 
            buffer.put(loop);
            try {
                Thread.sleep((long) (Math.random() * 1000)); 
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
