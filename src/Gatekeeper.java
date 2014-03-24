
public class Gatekeeper implements Runnable {
	
	private EventBarrier _barrier;
	
	public Gatekeeper(EventBarrier barrier){
		_barrier = barrier;
	}
	
	@Override
	public void run(){
		/*
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException exc){
			exc.printStackTrace();
		}
		*/
		System.out.println("Gate keeper has opened doors.");
		try{
			_barrier.raise();
		}
		catch (InterruptedException exc){
			exc.printStackTrace();
		}
	}
}
