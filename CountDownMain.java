public class CountDownMain {
	public static void main(String[] args) {
		CountDown cd = new CountDown();
		Runnable r = () -> {
			synchronized(cd) {
				cd.CD();
			}	
		};
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		t1.start();
		t2.start();
	}

}
