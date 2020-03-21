 


public interface Buffer{ 
	 // place int value into Buffer 6   
	 public void blockingPut(int value) throws InterruptedException; 
	  // return int value from Buffer 9   
	 public int blockingGet() throws InterruptedException; 
	 
	 } // 