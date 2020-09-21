package by.epam.novik.mod4.task10.airline;

import java.util.Arrays;

import by.epam.novik.mod4.task10.help.DayOfWeek;
import by.epam.novik.mod4.task10.help.Time;

//10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
//и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
//методами. Задать критерии выбора данных и вывести эти данные на консоль.
//Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
//Найти и вывести:
//a) список рейсов для заданного пункта назначения;
//b) список рейсов для заданного дня недели;
//c) список рейсов для заданного дня недели, время вылета для которых больше заданного.


public class Airline {
	
	
	private static final String DEFAULT_DESTINATION = "unknown";
	private static final int DEFAULT_FLIGHT_NUMBER = 0;
	private static final String DEFAULT_AIRCRAFT_TYPE = "unknown";
	private static final Time DEFAULT_DEPARTURE_TIME = new Time();
	private static final DayOfWeek [] DEFAULT_DEPARTURE_DAYS = new DayOfWeek[] {DayOfWeek.UNKNOWN};
	
	
	private String destination; 
	private int flightNumber;
	private String aircraftType;
	private Time departureTime;
	private DayOfWeek [] departureDays;
	
	
	
	
	
	
	public Airline() {
		
		this(DEFAULT_DESTINATION, DEFAULT_FLIGHT_NUMBER, DEFAULT_AIRCRAFT_TYPE, DEFAULT_DEPARTURE_TIME, DEFAULT_DEPARTURE_DAYS);

	}
	

	public Airline(String destination, int flightNumber, String aircraftType, Time departureTime,
			DayOfWeek[] departureDays) {
		super();
		this.destination = destination;
		this.flightNumber = flightNumber;
		this.aircraftType = aircraftType;
		this.departureTime = departureTime;
		this.departureDays = departureDays;
	}


	public String getDestination() {
		
		return destination;
		
	}


	public void setDestination(String destination) {
		
		this.destination = destination;
		
	}


	public int getFlightNumber() {
		
		return flightNumber;
		
	}


	public void setFlightNumber(int flightNumber) {
		
		this.flightNumber = flightNumber;
		
	}


	public String getAircraftType() {
		
		return aircraftType;
		
	}


	public void setAircraftType(String aircraftType) {
		
		this.aircraftType = aircraftType;
		
	}


	public Time getDepartureTime() {
		
		return departureTime;
		
	}


	public void setDepartureTime(Time departureTime) {
		
		this.departureTime = departureTime;
		
	}


	public DayOfWeek[] getDepartureDays() {
		
		return departureDays;
		
	}


	public void setDepartureDays(DayOfWeek[] departureDays) {
		
		this.departureDays = departureDays;
		
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aircraftType == null) ? 0 : aircraftType.hashCode());
		result = prime * result + Arrays.hashCode(departureDays);
		result = prime * result + ((departureTime == null) ? 0 : departureTime.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + flightNumber;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airline other = (Airline) obj;
		if (aircraftType == null) {
			if (other.aircraftType != null)
				return false;
		} else if (!aircraftType.equals(other.aircraftType))
			return false;
		if (!Arrays.equals(departureDays, other.departureDays))
			return false;
		if (departureTime == null) {
			if (other.departureTime != null)
				return false;
		} else if (!departureTime.equals(other.departureTime))
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (flightNumber != other.flightNumber)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [destination=" + destination + ", flightNumber=" + flightNumber + ", aircraftType="
				+ aircraftType + ", departureTime=" + departureTime + ", departureDays="
				+ Arrays.toString(departureDays) + "]";
	}
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	



}
