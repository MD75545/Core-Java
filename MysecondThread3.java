package Threading;

public class MysecondThread3 extends Thread {
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(this.currentThread().getName());
		}
	}
}
