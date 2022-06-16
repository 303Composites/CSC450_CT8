
public class CountUp implements Runnable{
	private volatile boolean isStopped = false;
	
	public void run() {
		while(!isStopped)
			try {
				Thread.sleep(200);
			}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i = 0; i <= 20; i++) //counting from 0-20 similar to the C++ example 
			System.out.println(i);
	}
	
	public void stop() {
		isStopped = true;
	}
}