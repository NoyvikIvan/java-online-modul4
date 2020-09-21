package by.epam.novik.mod4.task10.airline;

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


public class AirlineBaseLogic {
	
	public Airline[] getAirlineListForGivenDestination(AirlineBase base, String destination) {
		
		if (base == null || destination == null) {
			
			return new Airline[0];
			
		}
		
		AirlineBase tmp = new AirlineBase();
		Airline[] airlines = base.getAirlines();
		
		for (Airline airline : airlines) {
			
			if (airline != null && airline.getDestination().equals(destination)) {
				
				tmp.addAirline(airline);
				
			}
		}
		
		
		return tmp.getAirlines();

		
	}
	
	
	public Airline[] getAirlineListForGivenDayOfWeek(AirlineBase base, DayOfWeek dayOfWeek) {
		
		if (base == null || dayOfWeek == null) {
			
			return new Airline[0];
			
		}
		
		AirlineBase tmp = new AirlineBase();
		Airline[] airlines = base.getAirlines();
		DayOfWeek defaultFild = DayOfWeek.UNKNOWN;		
		
		for (Airline airline : airlines) {
			
			if (airline != null) {
				
				DayOfWeek[] departureDays = airline.getDepartureDays();
				
				for (DayOfWeek departureDay : departureDays) {
					
					if (departureDay != defaultFild && departureDay.equals(dayOfWeek)) {
						
						tmp.addAirline(airline);
						continue;
						
					}
				}
				
				
			}
		}
		
		
		return tmp.getAirlines();

		
	}
	
	public Airline[] getAirlineListForGivenDayOfWeekAfterGivenTime(AirlineBase base, DayOfWeek dayOfWeek, Time time) {
		
		Airline[] tmp = getAirlineListForGivenDayOfWeek(base, dayOfWeek);
		AirlineBase airlineBase = new AirlineBase();

		
		for (Airline airline : tmp) {
			
			if (airline.getDepartureTime().after(time)) {
				
				airlineBase.addAirline(airline);
				
			}
		}
		
		return airlineBase.getAirlines();
		
		
		
	}
	
	
	
	

}
