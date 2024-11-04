package interuptionDemo;

import state.Threadlob;

public class Clock implements Runnable{

	@Override
	public void run() {
		Thread current = Thread.currentThread();
		while(!current.isInterrupted()) {
			try {
				current.sleep(1000);
				System.out.println("Tic Toc");
			} catch (InterruptedException e) {
				
				System.out.println("wake up ...!!");
				return;
			}
			
		}
		
	}

}
