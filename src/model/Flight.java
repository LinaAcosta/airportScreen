package model;

public class Flight {
	public final static int AVIANCA = 1;
	public final static int AIRLINES = 2;
	public final static int LAN = 3;
	public final static int VIVACOLOMBIA = 4;
	public final static int EASYFLIGHT = 5;
	private Date date;
	private int nameAirline;
	private int numberFlight;
	private int destination;
	private int gate;
	public final static int ESPAÑA = 1;
	public final static int EEUU = 2;
	public final static int PERU = 3;
	public final static int MEXICO = 4;
	public final static int ARGENTINA = 5;
	public Flight(Date date, int nameAirline, int numberFlight, int destination, int gate) {
		this.date = date;
		this.nameAirline = nameAirline;
		this.numberFlight = numberFlight;
		this.destination = destination; 
		this.gate = gate;
	}
	public Date getDate() {
		return date;
	}
	public int getNameAirline() {
		return nameAirline;
	}
	public int getNumberFlight() {
		return numberFlight;
	}
	public int getDestination() {
		return destination;
	}
	public int getGate() {
		return gate;
	}
	public String defineNameAirLine() {
		String message = "";
		if(nameAirline == 1) {
			message = "Avianca";
		}
		else if(nameAirline == 2) {
			message = "Airlines";
		}
		else if(nameAirline == 3) {
			message = "Lan";
		}
		else if(nameAirline == 4) {
			message = "Viva Colombia";
		}
		else if(nameAirline == 5) {
			message = "Easy Flight";
		}
		return message;
	}
	public String defineDestination() {
		String message = "";
		if(destination == 1) {
			message = "España";
		}
		else if(destination == 2) {
			message = "EEUU";
		}
		else if(destination == 3) {
			message = "Peru";
		}
		else if(destination == 4) {
			message = "Mexico";
		}
		else if(destination == 5) {
			message = "Argentina";
		}
		return message;
	}
	public String getMessage() {
		String message = (date.getYear() + "/" + date.getMonth() + "/" + date.getDay() + "      " + date.getHour() + ":" + date.getMinut() + date.defineMoment() + " " + defineNameAirLine() + " " + numberFlight + " " + defineDestination() + "    "  + gate);
		return message;
	}

}
