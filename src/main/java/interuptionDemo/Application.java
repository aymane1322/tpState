package interuptionDemo;

public class Application {

	public static void main(String[] args) throws InterruptedException {
		

		Thread watch = new Thread(new Clock());
		watch.start();
		
		Thread.sleep(5000);
		watch.interrupt();
	}

}
