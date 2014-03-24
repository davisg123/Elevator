
public abstract class AbstractEventBarrier {
    
    /**
     * Instantiate the stateless AbstractEventBarrier.
     */
	
	protected int globalWorkers;
	
	public AbstractEventBarrier() {
	}

	/**
	 * Arrive at the barrier and wait until an event is signaled. Return
 	 * immediately if already in the signaled state.
 	 */
	public abstract void arrive() throws InterruptedException;

	/**
	 * Signal the event and block until all threads that wait for this
 	 * event have responded. The EventBarrier returns to an unsignaled state
 	 * before raise() returns.
 	 */	
	public abstract void raise() throws InterruptedException;
	
	/**
	 * Indicate that the calling thread has finished responding to a
 	 * signaled event, and block until all other threads that wait for 
 	 * this event have also responded.
 	 */
	public abstract void complete() throws InterruptedException;

	/**
	 * Return a count of threads that are waiting for the event or that
 	 * have not responded yet.
 	 */
	public abstract int waiters();
}
