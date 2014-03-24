
public class Minstrel implements Runnable {
	
	private EventBarrier _barrier;
	
	public Minstrel(EventBarrier barrier){
		_barrier = barrier;
	}
	
	@Override
	public void run() {
		String line2 = String.format("minstrel waiting with thread:%s", Thread.currentThread().getId());
		System.out.println(line2);
		try {
			Thread.sleep((long)(Math.random() * 1000));
		}
		catch (InterruptedException exc){
			exc.printStackTrace();
		}
		try{
			_barrier.arrive();
		}
		catch (InterruptedException exc){
			exc.printStackTrace();
		}
		try {
			Thread.sleep((long)(Math.random() * 1000));
		}
		catch (InterruptedException exc){
			exc.printStackTrace();
		}
		try{
			_barrier.complete();
		}
		catch (InterruptedException exc){
			exc.printStackTrace();
		}
		String line = String.format("minstrel crossed with thread:%s", Thread.currentThread().getId());
		System.out.println(line);
	}
}
