package priority;

public class ThreadPriority extends Thread{
	private String label;
	
	public ThreadPriority(String label) {
		this.label = label ;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.print(label);
		}
	}
}
