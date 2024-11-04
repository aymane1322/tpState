package state;

public class Threadlob extends Thread {

	public Threadlob(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		try {
			sleep(5000);
			System.out.println("le thread : "+Threadlob.currentThread().getName()
					+"avec l id = "+Thread.currentThread().getId()
					+"est entrain de s'exucuter ....");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
