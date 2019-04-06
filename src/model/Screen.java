package model;

import java.util.Random;

public class Screen {
	private Flight[] flights;
    public Screen() {
    	
    }
    public void generateRandomFlights(int num) {
    	flights = new Flight[num];
    	for(int i = 0; i< flights.length; i++) {
    		int hour = (int) (Math.random()*12 + 1);
    		int minut = (int) (Math.random()*59 + 1);
    		int number = (int) (Math.random()*500 + 3);
    		int gate = (int) (Math.random()*12 + 1);
    		Random aleatorio = new Random();
    		int year = aleatorio.nextInt(10)+2018;
    		int month = aleatorio.nextInt(12)+1;
    		int day = aleatorio.nextInt(30)+1;
    		int moment = (int) (Math.random()*2 + 1);
    		Date date = new Date(moment, month, year, hour, day, minut);
    		int destination = (int) (Math.random()*5 + 1);
    		int airline = (int) (Math.random()*5 + 1);
    		flights[i] = new Flight(date, airline, number, destination, gate);
    	}
    	
    }
    public Flight[] getFlights(){
    	return flights;
    }
    
    
    public void sortNormally() {
    	for(int i = 0; i<flights.length; i++) {
    		for(int j = 0; j< i - 1; j++) {
    			if(flights[j].getDate().getYear() >= flights[j+1].getDate().getYear()) {
    				Flight g = flights[j];
					flights[j] = flights[j+1];
					flights[j+1] = g;
    				if(flights[j].getDate().getMonth() >= flights[j+1].getDate().getMonth()) {
    					Flight l = flights[j];
						flights[j] = flights[j+1];
						flights[j+1] = l;
    					if(flights[j].getDate().getDay() <= flights[j+1].getDate().getDay()) {
    						Flight f = flights[j];
							flights[j] = flights[j+1];
							flights[j+1] = f;
    						if(flights[j].getDate().getMoment() <= flights[j+1].getDate().getMoment()) {
    							Flight m = flights[j];
    							flights[j] = flights[j+1];
    							flights[j+1] = m;
    						}
    					}
    				}
    			}
    		}
    	}
    }
    public String getMessage() {
    	String message = "";
    	for(int i = 0; i<flights.length; i++) {
    		message += flights[i].getMessage();
    		message += "\n";
    	}
    	System.out.println(message);
    	return message;
    }
    
}
