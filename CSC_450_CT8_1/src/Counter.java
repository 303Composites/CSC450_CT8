import java.util.concurrent.TimeUnit;
import static java.lang.Thread.currentThread;


public class Counter {
	public static void main(String[] args) throws InterruptedException {

		CountUp countUp = new CountUp();
		CountDown countDown = new CountDown();
		
		//creating the new threads
		Thread t1 = new Thread(countUp);
		Thread t2 = new Thread(countDown);
		
		//Starting the two threads
		t1.start();
		System.out.println(currentThread().getName() + "\nCounting up");
		countUp.stop(); //Stopping the counter to verify thread
		TimeUnit.MILLISECONDS.sleep(2000);
		t2.start(); //Stopping counter to verify thread 
		countDown.stop();
		TimeUnit.MILLISECONDS.sleep(1500);
	}
	
}