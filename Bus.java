package JAVAProject.java;

public class Bus {
	
	private int busNo;
	private boolean ac;
	private int capacity;  //get and set method
	
	Bus(int no, boolean ac, int capacity){
		this.busNo = no;
		this.ac = ac;
		this.capacity = capacity;
	}
	
	public int getBusNo() {  // Get method accessor method
		return busNo;
	}
	
	public boolean isAc() {
		return ac;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public void  setBusNo(int no) {// set method mutator
		this.busNo = no;
	}
	
	public void setIsAc(boolean ac) {
		this.ac = ac;
	}
	
	public void setCapacity(int cap) {
		this.capacity = cap;
	}
	
	public void displayBusInfo() {
		System.out.println("Bus No: " + busNo + " Ac: " + ac + "Total Capacity: " + capacity);
	}
	
}







