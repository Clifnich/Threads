public class getID {
	public static void main(String[] args) {
		Runnable r = () -> {
			System.out.println("ID: " + getid());
		};
		Thread t1 = new Thread(r, "One");
		Thread t2 = new Thread(r, "Two");
		t1.start();
		t2.start();
	}

	public synchronized static int getid() {
		return counter++;
	}

	private static int counter = 1;
}
