package Threading;

public class SleepDemo {

	public static void main(String[] args) {
		MySleepThread t1=new MySleepThread();
		MyThread1 t2=new MyThread1();
		t1.setName("Ram Thread");
		t2.setName("Shayam Thread");
		
		t1.start();
		t2.start();
		for(int i=0;i<=10;i++)
		{
			System.out.println("Main thread Executing....");
		}

	}

}
