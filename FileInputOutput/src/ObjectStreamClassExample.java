import java.io.ObjectStreamClass;
import java.util.Calendar;

public class ObjectStreamClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create an new object stream class for integer
		
		ObjectStreamClass osc = ObjectStreamClass.lookup(String.class);
		
		//get the value field from ObjectStreamClass for Integer
		System.out.print(""+osc.getField("price"));
		
		//create a new object stream class for clanender
		ObjectStreamClass osc2 =  ObjectStreamClass.lookup(Calendar.class);
		
		//get the Class instance for osc2
		System.out.println(""+osc2.getField("hash"));

	}

}
