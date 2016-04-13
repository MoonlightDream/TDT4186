
public class IO {
	
	private Queue IOqueue;
	private Statistics statistics;

	
	public IO(Queue IOqueue, Statistics statistics, long IOsize){
		this.IOqueue = IOqueue;
		this.statistics = statistics;
		
	}
	
	public void timePassed(long timePassed) {
		statistics.memoryQueueLengthTime += IOqueue.getQueueLength()*timePassed;
		if (IOqueue.getQueueLength() > statistics.IOQueueLargestLength) {
			statistics.IOqueueLargestLength = IOqueue.getQueueLength(); 
		}
    }
	
	public void insertProcess(Process p) {
		IOqueue.insert(p);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}