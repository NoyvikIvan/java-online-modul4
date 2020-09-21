package by.epam.novik.mod4.task10.airline;

//10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
//и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
//методами. Задать критерии выбора данных и вывести эти данные на консоль.
//Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
//Найти и вывести:
//a) список рейсов для заданного пункта назначения;
//b) список рейсов для заданного дня недели;
//c) список рейсов для заданного дня недели, время вылета для которых больше заданного.

public class AirlineBase {

	private Airline[] airlines;
	private int size;

	public AirlineBase() {

		super();
		airlines = new Airline[10];

	}

	public AirlineBase(Airline... airlines) {

		if (airlines != null && airlines.length != 0) {

			this.airlines = new Airline[airlines.length * 2];

			for (int i = 0; i < airlines.length; i++) {

				this.airlines[i] = airlines[i];
				size++;

			}

		} else {

			this.airlines = new Airline[10];

		}

	}
	
	public int size() {
		
		return size;
		
	}
	
	public Airline[] getAirlines() {
		
		Airline[] airlines = new Airline[size];
		
		for (int i = 0; i < airlines.length; i++) {
			
			airlines[i] = this.airlines[i];
			
		}
		
		return airlines;
		
		
		
		
	}
	
	public void addAirline(Airline airline) {

		if (size == airlines.length) {

			Airline[] tmp = new Airline[size * 2];

			for (int i = 0; i < airlines.length; i++) {

				tmp[i] = airlines[i];

			}

			airlines = tmp;

		}

		airlines[size] = airline;
		size++;

	}

}
