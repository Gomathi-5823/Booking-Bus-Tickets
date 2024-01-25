package JAVAProject.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Booking {
	
	String passengerName;
	int busNo;
	Date date;
	
	Booking() throws ParseException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enterr the Name of Passengers: ");
		passengerName = sc.next();
		System.out.println("Enter Bus No: ");
		busNo = sc.nextInt();
		System.out.println("Enter date DD:MM:YYYY: ");
		String dateInput = sc.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("DD:MM:YYYY");
		
		date = dateFormat.parse(dateInput);
		
	}
	
	public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {
		int capacity = 0;
		for(Bus bus:buses) {
			if(bus.getBusNo()==busNo) {
				capacity = bus.getCapacity();
			}
		}
		
		int booked = 0;
		for(Booking b:bookings) {
			if(b.busNo==busNo && b.date.equals(date)) {
				booked++;
			}
		}
		
		return booked<capacity?true:false;
	}

}
