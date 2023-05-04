package Threading;

public class MyThread1 extends Thread {
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			try {
				this.currentThread().sleep(2000);
				System.out.println(this.currentThread().getName());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	}
	}
	