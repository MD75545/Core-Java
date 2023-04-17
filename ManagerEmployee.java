package Com.Test.Main;
import Com.Test.simpleprogram.Salesperson;
import Com.Test.simpleprogram.Manager;
public class ManagerEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Manager obj=new Manager(100,"Mihir", 90000, "finance", 50000, 80000);
			System.out.println(obj);
			Salesperson obj2=new Salesperson( 100,"mihir",9000f,80);
			System.out.println(obj2);
	}

}
