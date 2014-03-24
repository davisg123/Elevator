
public class EventBarrier extends AbstractEventBarrier {
	private volatile boolean signal;
	private int waiters = 0;
	
	public EventBarrier(){
		super();
		//initialize
		signal = false;
	}
	
	@Override
	public synchronized void arrive() throws InterruptedException{
		if (!signal){
			//another person in line
			waiters++;
			while (!signal){
				this.wait();
			}
		}
		//otherwise gate is open, everyone goes through
	}
	@Override
	public synchronized void raise() throws InterruptedException{
		signal = true;
		notifyAll();
		while (waiters() > 0){
			this.wait();
		}
		signal = false;
		notifyAll();
	}
	@Override
	public synchronized void complete() throws InterruptedException{
		waiters--;
		notifyAll();
		while (!signal){
			this.wait();
		}
	}
	@Override
	public int waiters(){
		return waiters;
	}
}
