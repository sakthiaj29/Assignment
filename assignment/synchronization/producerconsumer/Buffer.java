package assignment.synchronization.producerconsumer;

class Buffer {
    private int value;
    private boolean isEmpty = true;

    public synchronized void put(int value) {
        while (!isEmpty) {
            try {
                wait(); 
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.value = value;
        isEmpty = false;
        System.out.println("Produced: " + value);
        notify(); 
    }

    public synchronized int get() {
        while (isEmpty) {
            try {
                wait(); 
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        int retrievedValue = value;
        isEmpty = true;
        System.out.println("Consumed: " + retrievedValue);
        notify(); 
        return retrievedValue;
    }
}
