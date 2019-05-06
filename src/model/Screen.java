package model;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Screen {
	private Flight first;
    public Screen() {
    	
    }
    public Flight generate() {
    	String[] nairline= new String[]{"AVIANCA", "AIRLINES", "LAN", "VIVACOLOMBIA", "EASYFLIGHT"};
    	String[] des = new String[] {"ESPAÑA", "EEUU", "PERU", "MEXICO", "ARGENTINA"};
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
    	int destinationNumber = (int) (Math.random()*4 + 1);
    	String dest = des[destinationNumber];
    	int airlineNumber = (int) (Math.random()*4 + 1);
    	String airline = nairline[airlineNumber];
    	Flight f = new Flight(date, dest, number, airline, gate, null);
    	return f;
    }
    public void generateRandomFlights(int num) {
    	first = generate();
    	Flight current = first;
    	for(int i = 0; i<num - 1; i++) {
    		current.setNext(generate());
    		current = current.getNext();
    	}
    	
    }
    
    /**
    public void sortNormally() {
    	int i;
    	int k;
    	int p;
    	Flight buffer;
    	int limit = flights.length-1;
        for(k = 0; k < limit; k++){
            p = k;
            for(i = k+1; i <= limit; i++){
                if(flights[i].getDate().getYear() < flights[p].getDate().getYear()) { 
                	p = i;
                	if(flights[i].getDate().getMonth() < flights[p].getDate().getMonth()) {
                		p = i;
                		if(flights[i].getDate().getDay() < flights[p].getDate().getDay()) {
                    		p = i;
                    		if(flights[i].getDate().getMoment() < flights[p].getDate().getMoment()) {
                        		p = i;
                        		if(flights[i].getDate().getHour() < flights[p].getDate().getHour()) {
                            		p = i;
                            		if(flights[i].getDate().getMinut() < flights[p].getDate().getMinut()) {
                                		p = i;
                                	}
                            	}
                        		
                        	}
                    	}
                	}
                }
                if(p != k){
                    buffer = flights[p];
                    flights[p] = flights[k];
                    flights[k] = buffer;
                }
            }
        }
    }
    */
    public void sortByNumber() {
    	  Flight current;
    	  Flight next;
    	  Flight t;
    	  current = first;
    	  while(current != null){
    	        next = current.getNext();
    	        while(next!=null){
    	             if(current.getNumberFlight() > next.getNumberFlight()){
    	                t = next;
    	                next = current;
    	                current = t;          
    	             }
    	             next = next.getNext();
    	        }    
    	        current = current.getNext(); 
    	 }
    	Flight a = first;
    	while(a!= null) {
    		System.out.print(a.getMessage() + "\n");
    		a = a.getNext();
    	}
    }
    
    
    public void sortByGate() {
      Flight current;
  	  Flight next;
  	  Flight t;
  	  current = first;
  	  while(current != null){
  	        next = current.getNext();
  	        while(next!=null){
  	             if(current.getGate() > next.getGate()){
  	                t = next;
  	                next = current;
  	                current = t;          
  	             }
  	             next = next.getNext();
  	        }    
  	        current = current.getNext(); 
  	 }
  	Flight a = first;
  	while(a!= null) {
  		System.out.print(a.getMessage() + "\n");
  		a = a.getNext();
  	}
    	   
    }
    /**
    public String getMessage() {
    	String message = "";
    	Flight current = first;
    	while(current != null) {
    		message += current.getMessage();
    		message += "\n";
    		current = current.getNext();
    	}
    	System.out.println(message);
    	return message;
    }
    */
    public void sortByAirline() {
      Flight current;
  	  Flight next;
  	  Flight t;
  	  current = first;
  	  while(current != null){
  	        next = current.getNext();
  	        while(next!=null){
  	             if(current.getNameAirline().compareTo(next.getNameAirline()) < 0){
  	                t = next;
  	                next = current;
  	                current = t;          
  	             }
  	             next = next.getNext();
  	        }    
  	        current = current.getNext(); 
  	 }
  	Flight a = first;
  	while(a!= null) {
  		System.out.print(a.getMessage() + "\n");
  		a = a.getNext();
  	}
    }
    
    public void sortByDestination() {
    	  Flight current;
    	  Flight next;
    	  Flight t;
    	  current = first;
    	  while(current != null){
    	        next = current.getNext();
    	        while(next!=null){
    	             if(current.getDestination().compareTo(next.getDestination()) < 0){
    	                t = next;
    	                next = current;
    	                current = t;          
    	             }
    	             next = next.getNext();
    	        }    
    	        current = current.getNext(); 
    	 }
    	Flight a = first;
    	while(a!= null) {
    		System.out.print(a.getMessage() + "\n");
    		a = a.getNext();
    	}
    }
    /**
    public String searchByDate(Date date) {
    	Flight f = null;
    	ArrayList<Flight> array = new ArrayList<>();
    	for(int i = 0; i<flights.length; i++) {
    		if(flights[i].getDate().getYear() == date.getYear() && flights[i].getDate().getMonth() == date.getMonth() && flights[i].getDate().getDay() == date.getDay()) {
    			f = flights[i];
    			array.add(f);
    		}
    		
    	}
    	String message = "";
        for(int i = 0; i<array.size(); i++) {
        	message += array.get(i).getMessage();
        	message += "\n";
        }
        System.out.println(message);
        return message;	
    	
    }
    public String searchByNumber(int number) {
    	boolean stop = false;
    	int low = 0;
    	int hight = flights.length - 1;
    	ArrayList<Flight> array = new ArrayList<>();
    	for(int i = 0; i<flights.length; i++) {
    		while(low <= hight && !stop) {
        		int mid = (low+hight)/2;
        		if(flights[mid].getNumberFlight() == number) {
        			stop = true;
        			array.add(flights[mid]);
        		}
        		else if(number < flights[mid].getNumberFlight()) {
        			hight = mid -1;
        		}
        		else {
        			low = mid + 1;
        		}
        	}
    	}
    	
    	String message = "";
        for(int i = 0; i<array.size(); i++) {
        	message += array.get(i).getMessage();
        	message += "\n";
        }
        System.out.println(message);
        return message;
        	
    	
    	
    	
    }
    	
    public String searchByGate(int gate) {
    	boolean stop = false;
    	int low = 0;
    	int hight = flights.length - 1;
    	ArrayList<Flight> array = new ArrayList<>();
    	for(int i = 0; i< flights.length; i++) {
    		while(low <= hight && !stop) {
        		int mid = (low+hight)/2;
        		if(flights[mid].getGate() == gate) {
        			stop = true;
        			array.add(flights[mid]);
        		}
        		else if(gate < flights[mid].getGate()) {
        			hight = mid -1;
        		}
        		else {
        			low = mid + 1;
        		}
        	}
    	}
    	String message = "";
        for(int i = 0; i<array.size(); i++) {
        	message += array.get(i).getMessage();
        	message += "\n";
        }
        System.out.println(message);
        	
    	return message;
    	
    }
    public String searchByAirLine(String airline) {
    	ArrayList<Flight> array = new ArrayList<>();
    	for(int i = 0; i<flights.length; i++) {
    		if(flights[i].getNameAirline() == airline) {
    			array.add(flights[i]);
    		}
    	}
    	String message = "";
        for(int i = 0; i<array.size(); i++) {
        	message += array.get(i).getMessage();
        	message += "\n";
        }
        System.out.println(message);
        return message;
    	
    }
    public String searchByDestination(String destination) {
    	ArrayList<Flight> array = new ArrayList<>();
    	for(int i = 0; i<flights.length; i++) {
    		if(flights[i].getDestination() == destination) {
    			array.add(flights[i]);
    		}
    		
    	}
    	String message = "";
    	for(int i = 0; i<array.size(); i++) {
    		message += array.get(i).getMessage();
    		message += "\n";
    	}
    	System.out.println(message);
    	return message;
    	
    }
    */
    
}
