
public class EventBarrierTests {
	public static void main(String args[]){
		EventBarrier barrier = new EventBarrier();
		
		for (int i = 0; i<10; i++){
			Minstrel minstrel = new Minstrel(barrier);
			new Thread(minstrel).start();
		}
		Gatekeeper gatekeeper = new Gatekeeper(barrier);
		new Thread(gatekeeper).start();
	}
}
