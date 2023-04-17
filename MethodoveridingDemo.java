package Com.Test.Main;
import Com.Test.simpleprogram.Base;
import Com.Test.simpleprogram.Child;
import Com.Test.simpleprogram.Child2;


public class MethodoveridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Base obj=new Child();
         obj.getData();
         obj=new Child2();
         obj.getData();
         
	}

}
