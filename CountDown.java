public class CountDown {
	public void CD() {
		try {
			for (int i = 10; i > 0; i--) {
				System.out.println(" ---- " + i);
			}
			System.out.println(" ---- Blast! ");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
