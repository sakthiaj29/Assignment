package assignment.synchronization.resource;

public class ResourceB{
    public void methodB(ResourceA resourceA) {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " acquired lock on ResourceB");

            try {
                Thread.sleep(2000); 
            } catch (Exception e) {
                e.printStackTrace();
            }

            synchronized (resourceA) {
                System.out.println(Thread.currentThread().getName() + " acquired lock on ResourceA");
            }
        }
    }
}