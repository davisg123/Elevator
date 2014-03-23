
public class EventBarrier extends AbstractEventBarrier {
	private volatile boolean signal;
	private int numWaiters;
	
	@Override
	public synchronized void arrive(){
		
	}
	@Override
	public synchronized void raise(){
		
	}
	@Override
	public synchronized void complete(){
		
	}
	@Override
	public int waiters(){
		return numWaiters;
	}
}
