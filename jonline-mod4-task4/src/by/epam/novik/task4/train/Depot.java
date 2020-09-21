package by.epam.novik.task4.train;

/*
4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. Создайте массив из пяти элементов
типа Train, добавьте возможность сортировки элементов массива по номерам поездов. Добавьте возможность вывода информации о поезде, номер 
которого введен пользователем. Добавьте возможность сортировки массива по пункту назначения, причём поезда с одинаковыми пунктами 
назначения должны быть упорядочены по времени отправления.
*/

public class Depot {
	
	private static final String STATION = "г. Минск";
	
	private Train[] trains;
	private final String station;

	public Depot(String station, Train ... trains) {
		super();
		this.station = station;
		this.trains = trains;
	}

	public Depot() {
		super();
		station = STATION;
	}
	
	public Depot(Train ... trains) {
		super();
		station = STATION;
		this.trains = trains;
	}
	

	public Train[] getTrains() {
		return trains;
	}

	public void setTrains(Train ... trains) {
		
		this.trains = trains;
	}
	
	public String getStation() {
		return station;
	}
	
	
}
