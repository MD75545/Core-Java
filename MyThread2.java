package Threading;

public class MyThread2 extends Thread{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			//this.currentThread().yield();
			System.out.println(this.currentThread().getName());
		}
	}

}
