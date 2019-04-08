package model;

import java.util.Comparator;

public class FlightDestinationComparator implements Comparator<Flight>{

	@Override
	public int compare(Flight f1, Flight f2) {
		int comparation;
		String destination1 = f1.getDestination();
		String destination2 = f2.getDestination();
		if(destination1.compareTo(destination2)<0) {
			comparation = -1;
		}else if(destination1.compareTo(destination2)>0) {
			comparation = 1;
		}else {
			comparation = 0;
		}
		return comparation;
	}

}
