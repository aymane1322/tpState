package priority;

public class Application {

	public static void main(String[] args) {
		
		ThreadPriority tp1 = new ThreadPriority("*");
		ThreadPriority tp2 = new ThreadPriority("+");
		
		tp1.setPriority(10); // tp1.setPriority(Thread.MAX_PRIORITY);
		tp2.setPriority(1);  // tp2.setPriority(Thread.MIN_PRIORITY);
		
		tp1.start();
		tp2.start();
		
		
		

	}

}
