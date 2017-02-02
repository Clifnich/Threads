public class TestThreads {

	public static void main(String[] args) {
		Runnable r1 = () -> {
			for (int i = 0; i < 5; i++) 
				System.out.println("Hello");
		};
		Runnable r2 = () -> {
			for (int i = 0; i < 5; i++)
				System.out.println("Hi");
		};
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		try {
			t1.join();
		} catch (Exception e) {
			System.out.println(e);
		}
		t2.start();
		System.out.println("Hello");
	}

}
