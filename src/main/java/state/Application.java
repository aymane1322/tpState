package state;

public class Application {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("=================NEW================");
		Threadlob t = new Threadlob("T1");
		displayStateAndIsAlive(t);
		System.out.println("================RUNNABLE=================");
		t.start();
		displayStateAndIsAlive(t);
		System.out.println("===============TIMED WAITING==================");
		t.sleep(2000);
		displayStateAndIsAlive(t);
		
		System.out.println("===============TERMINATED==================");
		
		Thread.sleep(4000);
		displayStateAndIsAlive(t);
	}
	
	public static void displayStateAndIsAlive(Thread t) {
		System.out.println("the state of "+t.getName()+" is :" + t.getState());
		System.out.println("the thread "+t.getName()+" is Alive ? :" + t.isAlive());
		
	}

}
