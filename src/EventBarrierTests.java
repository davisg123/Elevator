
public class EventBarrierTests {
	public static void main(String args[]){
		EventBarrier barrier = new EventBarrier();
		System.out.println("10 Minstrels are arriving.");
		for (int i = 0; i<10; i++){
			Minstrel minstrel = new Minstrel(barrier);
			new Thread(minstrel).start();
		}
		try{
			Thread.sleep(500);
		}
		catch(InterruptedException exc){
			exc.printStackTrace();
		}
		System.out.println("Gate opening");
		Gatekeeper gatekeeper = new Gatekeeper(barrier);
		new Thread(gatekeeper).start();
		System.out.println("More minstrels are arriving.");
		for (int i = 0; i<10; i++){
			Minstrel minstrel = new Minstrel(barrier);
			new Thread(minstrel).start();
		}
	}
}
