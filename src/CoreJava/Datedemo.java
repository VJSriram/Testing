package CoreJava;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Datedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Retriving Dates by using Java
		// How to find current.date current.time
		
		Date d= new Date();
		System.out.println(d.toString());
		
		// How to customize date and time
		
		SimpleDateFormat sdf= new SimpleDateFormat("MM/dd/yyyy");
		System.out.println(sdf.format(d));
		
		SimpleDateFormat sd= new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		System.out.println(sd.format(d));
		

	}

}
