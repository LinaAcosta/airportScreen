package model;

public class Date {
	public final static int AM = 1;
	public final static int PM = 2;
	private int moment;
	private int month;
	private int year;
	private int hour;
	private int day;
	private int minut;
	public Date(int moment, int month, int year, int hour, int day, int minut) {
		this.moment = moment;
		this.month = month;
		this.year = year;
		this.hour = hour;
		this.day = day;
		this.minut = minut; 
	}
	public int getMoment() {
		return moment;
	}
	public String defineMoment() {
		String message = "";
		if(moment == 1) {
			message = "AM";
		}
		else {
			message = "PM";
		}
		return message;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	public int getHour() {
		return hour;
	}
	public int getMinut() {
		return minut;
	}
	public int getDay() {
		return day;
	}
	
	
	
}