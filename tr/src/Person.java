import java.util.concurrent.Semaphore;


public class Person extends  Thread{
    public Semaphore left;
    public Semaphore right;
    public int pNumber;
    public String status;

    public Person(Semaphore left, Semaphore right, int pNumber) {
        this.pNumber = pNumber;
        this.left = left;
        this.right = right;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void run() {
        do {
            try {
                //waiting
                this.setStatus("waiting");
                while (this.left.availablePermits() <= 0) {

                }
                this.left.acquire();

                while (this.right.availablePermits() <= 0) {

                }
                this.right.acquire();

                // eating
                this.setStatus("eating");
                sleep(10000);

                this.left.release();
                this.right.release();

                // thinking
                this.setStatus("thinking");
                sleep(10000);

            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        while (true);
    }
}
