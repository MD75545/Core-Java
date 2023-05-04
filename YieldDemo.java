package Threading;

public class YieldDemo {

	public static void main(String[] args) throws InterruptedException{
		MyThread2 t1=new MyThread2();
		MysecondThread3 t2=new MysecondThread3();

	t1.setName("ram thread");
	t2.setName("Shayam Thread");
	t1.start();
	t2.start();
	
	}

}
