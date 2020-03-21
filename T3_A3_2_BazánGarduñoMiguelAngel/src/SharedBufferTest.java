import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors; 
import java.util.concurrent.TimeUnit; 



public class SharedBufferTest { 
	public static void main(String[] args) throws InterruptedException{
		
		  ExecutorService executorService = Executors.newCachedThreadPool(); 
		  
		  Buffer sharedLocation = new SynchronizedBuffer();
		  
		  executorService.execute(new Producer(sharedLocation));
		  executorService.execute(new Consumer(sharedLocation));
		  
		  executorService.shutdown(); 
		  executorService.awaitTermination(1, TimeUnit.MINUTES); 

		  
		  System.out.printf("%-40s%s\t\t%s%n%-40s%s%n%n", "Operation", 
				  "Buffer", "Occupied", "---------", "------\t\t--------"); 
	}
}