package by.epam.novik.mod4.task10;


import by.epam.novik.mod4.task10.airline.Airline;
import by.epam.novik.mod4.task10.airline.AirlineBase;
import by.epam.novik.mod4.task10.airline.AirlineBaseLogic;
import by.epam.novik.mod4.task10.airline.AirlineBaseView;
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

public class Main {

	public static void main(String[] args) {

		
		Airline[ ] airlines = new Airline[6];
		
		airlines[0] = new Airline("г. Гомель", 3, "Airbus-A380", new Time(12,00), new DayOfWeek[] {DayOfWeek.MONDAY});
		airlines[1] = new Airline("г. Минск", 5, "Boeing-747", new Time(9,00), new DayOfWeek[] {DayOfWeek.SUNDAY, DayOfWeek.FRIDAY});
		airlines[2] = new Airline("г. Гродно", 7, "Boeing-747", new Time(20,00), new DayOfWeek[] {DayOfWeek.MONDAY, DayOfWeek.SATURDAY});
		airlines[3] = new Airline("г. Гомель", 11, "Airbus-A380", new Time(22,00), new DayOfWeek[] {DayOfWeek.WEDNESDAY, DayOfWeek.THURSDAY});
		airlines[4] = new Airline("г. Минск", 17, "Boeing-747", new Time(10,00), new DayOfWeek[] {DayOfWeek.FRIDAY});
		airlines[5] = new Airline("г. Гомель", 19, "Airbus-A380", new Time(15,30), new DayOfWeek[] {DayOfWeek.MONDAY, DayOfWeek.WEDNESDAY, DayOfWeek.SUNDAY});

		AirlineBase base = new AirlineBase(airlines);
		AirlineBaseView view = new AirlineBaseView();
		AirlineBaseLogic logic = new AirlineBaseLogic();
		AirlineBase airlineBase;
		Airline[ ] filteredАirlines;
		
		
		view.showAirlineList(base);
		System.out.println();

		base.addAirline(new Airline());
	//	view.showAirlineList(base);

		//список рейсов для  пункта назначения г.Гомель
		filteredАirlines = logic.getAirlineListForGivenDestination(base, "г. Гомель");
		airlineBase = new AirlineBase(filteredАirlines);
		view.showAirlineList(airlineBase);
		System.out.println();


		// список рейсов для дня недели пятница;
		filteredАirlines = logic.getAirlineListForGivenDayOfWeek(base, DayOfWeek.FRIDAY);
		airlineBase = new AirlineBase(filteredАirlines);
		view.showAirlineList(airlineBase);
		System.out.println();
		
		// список рейсов для дня недели понедельник, время вылета для которых после 15-00.
		filteredАirlines = logic.getAirlineListForGivenDayOfWeekAfterGivenTime(base, DayOfWeek.MONDAY, new Time(15, 0));
		airlineBase = new AirlineBase(filteredАirlines);
		view.showAirlineList(airlineBase);
		System.out.println();
	}

}
