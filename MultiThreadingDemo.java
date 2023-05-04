package Threading;

public class MultiThreadingDemo {

	public static void main(String[] args) {
		MyThread t1=new MyThread();
		MySecondThread t2=new MySecondThread();
		//t1.run();
		t1.start();
		t2.run();
		for(int i=0;i<=10;i++)
		{
			System.out.println("Main thread executing");
		}

	}

}
