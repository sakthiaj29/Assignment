package assignment.synchronization.resource;

public class ResourceA{
    public void methodA(ResourceB resourceB) {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " acquired lock on ResourceA");

            try {
                Thread.sleep(2000); 
            } catch (Exception e) {
                e.printStackTrace();
            }

            synchronized (resourceB) {
                System.out.println(Thread.currentThread().getName() + " acquired lock on ResourceB");
            }
        }
    } 
}
