
public class CountDown implements Runnable{
	private volatile boolean isStopped = false;
	
	public void run() {
		while(!isStopped)
			try {
				Thread.sleep(200);
			}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Count Down Started");
		for(int i = 20; i >= 0; i--) //counting down from 20-0 similar to the C++ example 
			System.out.println(i);
	}
	
	public void stop() {
		isStopped = true;
	}
}