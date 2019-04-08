package model;

public class Flight implements Comparable<Flight>{
	private Date date;
	private String nameA;
	private int numberFlight;
	private String dest;
	private int gate;
	public Flight(Date date,String des, int numberFlight,String nairline, int gate) {
		this.date = date;
		this.nameA = nairline;
		this.numberFlight = numberFlight;
		this.dest = des;
		this.gate = gate;
	}
	public Date getDate() {
		return date;
	}
	public String getNameAirline() {
		return nameA;
	}
	public int getNumberFlight() {
		return numberFlight;
	}
	public String getDestination() {
		return dest;
	}
	public int getGate() {
		return gate;
	}
	public String getMessage() {
		String message = (date.getYear() + "/" + date.getMonth() + "/" + date.getDay() + "      " + date.getHour() + ":" + date.getMinut() + date.defineMoment() + " " + nameA + " " + numberFlight + " " + dest + "    "  + gate);
		return message;
	}
	@Override
	public int compareTo(Flight f1) {
		int comparation;
		if(nameA.compareTo(f1.getNameAirline())<0) {
			comparation = -1;
		}
		else if(nameA.compareTo(f1.getNameAirline())>0) {
			comparation = 1;
		}
		else {
			comparation = 0;
		}
		return comparation;
	}
	

}
