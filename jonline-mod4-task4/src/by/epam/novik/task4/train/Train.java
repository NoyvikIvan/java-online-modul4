package by.epam.novik.task4.train;

import by.epam.novik.task4.help.Time;
/*
4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. Создайте массив из пяти элементов
типа Train, добавьте возможность сортировки элементов массива по номерам поездов. Добавьте возможность вывода информации о поезде, номер 
которого введен пользователем. Добавьте возможность сортировки массива по пункту назначения, причём поезда с одинаковыми пунктами 
назначения должны быть упорядочены по времени отправления.
*/

public class Train {
	
	private static final String DESTINATION = "г. Гомель";
	private static final int TRAIN_NUMBER = 0;
	
	private String destination;
	private int trainNumber;
	private Time departureTime;
	
	
	public Train(String destination, int trainNumber, Time departureTime) {
		super();
		this.destination = destination;
		this.trainNumber = trainNumber;
		this.departureTime = departureTime;
	}
	
	public Train() {
		super();
		destination = DESTINATION;
		trainNumber = TRAIN_NUMBER;
		departureTime = new Time();
	}
	
	public String getDestination() {
		return destination;
	}
	
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	public int getTrainNumber() {
		return trainNumber;
	}
	
	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}
	
	public Time getDepartureTime() {
		return departureTime;
	}
	
	public void setDepartureTime(Time departureTime) {
		this.departureTime = departureTime;
	}
	
	
	
}
