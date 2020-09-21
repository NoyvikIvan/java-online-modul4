package by.epam.novik.task4.view;

import by.epam.novik.task4.logic.TrainLogic;
import by.epam.novik.task4.train.Depot;
import by.epam.novik.task4.train.Train;
/*
4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. Создайте массив из пяти элементов
типа Train, добавьте возможность сортировки элементов массива по номерам поездов. Добавьте возможность вывода информации о поезде, номер 
которого введен пользователем. Добавьте возможность сортировки массива по пункту назначения, причём поезда с одинаковыми пунктами 
назначения должны быть упорядочены по времени отправления.
*/

public class TrainView {

	public void showTrainsInDepot(Depot depot) {

		Train[] trains = depot.getTrains();
		String station = depot.getStation();

		for (Train train : trains) {

			int trainNumber = train.getTrainNumber();
			String destination = train.getDestination();
			int hour = train.getDepartureTime().getHour();
			int min = train.getDepartureTime().getMin();

			System.out.println("Поезд № " + trainNumber + " " + station + " - " + destination
					+ " прибывает в место назначение в " + hour + " часов " + min + " минут.");

		}

	}

	public void showAavailableTrains(Depot depot) {

		Train[] trains = depot.getTrains();
		String station = depot.getStation();

		System.out.println("Поезда находящиеся в депо " + station + ":");

		for (Train train : trains) {

			System.out.print("№" + train.getTrainNumber() + ", ");

		}

		System.out.println("");

	}

	public void showTrainInfo(Train train) {

		int trainNumber = train.getTrainNumber();
		String destination = train.getDestination();
		int hour = train.getDepartureTime().getHour();
		int min = train.getDepartureTime().getMin();

		System.out.println("Поезд № " + trainNumber + " прибывает в "  + destination + 
				" в " + hour + " часов " + min + " минут.");

	}
	
	public void showTrainInfoByNumber(Depot depot) {
		
		showAavailableTrains(depot);
		
		TrainLogic logic = new TrainLogic();
		int number = logic.getUserChoise("Введите номер поезда из списка для получения информации");
		
		
		Train train = logic.findTrainByNumber(depot, number);
		
		if (train != null) {
			
			showTrainInfo(train);
			
		} else {
			
			System.out.println("Поезд с указаным номером отсутствует");
		}
		
	}


}
