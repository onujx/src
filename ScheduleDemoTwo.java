import java.util.Timer;
import java.util.TimerTask;



public class ScheduleDemoTwo {
    public static void main(String[] args) {
        Timer timer = new Timer("taskthread");
        TaskTwo task = new TaskTwo(1); //passed counter as 1
        int startTime = 3; //in seconds
		System.out.println("Task will start after "+ startTime +" seconds." );
		System.out.println("This timer will be recount every 2 seconds");
        timer.schedule(task, startTime*1000, 2000); //start after 3 seconds and repeat after every 2 seconds
     	try {
		Thread.sleep(15000); //Main thread sleep for 15 seconds.
	} catch (InterruptedException e) {
		e.printStackTrace();
	} finally {
	       timer.cancel();
	}
     	System.out.println("Timer stopped.");
    }
}

class TaskTwo extends TimerTask {
	private int counter;
	public TaskTwo(int counter) {
		this.counter = counter;
	}
        @Override
        public void run() {
             System.out.println("Counter " + counter++ +": Doing task...");
        }
}  

