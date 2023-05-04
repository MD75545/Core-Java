package Threading;

public class YieldDemo2 {

	public static void main(String[] args) throws InterruptedException {
		MyThread2 t1=new MyThread2();
		MysecondThread3 t2=new MysecondThread3();
		MySleepThread t3=new MySleepThread();
		t3.setName("Sleepy Thread");
		t1.setName("Ram Thread");
		t3.start();
		t3.join();
		t1.start();
		
		
		

	}

}
