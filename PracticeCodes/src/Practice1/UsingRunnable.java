package Practice1;

public class UsingRunnable implements Runnable {
	 
		Thread thread;
		int high, low;
		String msg;

		public UsingRunnable(int low, int high, String msg)//parameterised constructor
		{
			this.high = high;
			this.low = low;
			this.msg = msg;
			thread = new Thread(this, "Child Thread");//object to call life cycle methods
			thread.start();
		}

		@Override
		public void run() {
			for (int i = low; i <= high; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("Error " + e.getMessage());
				}
				System.out.println(msg + i);
			}
		}
	}

