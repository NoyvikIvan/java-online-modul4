package by.epam.novik.task4.main;

import by.epam.novik.task4.help.Time;
import by.epam.novik.task4.logic.TrainLogic;
import by.epam.novik.task4.train.Depot;
import by.epam.novik.task4.train.Train;
import by.epam.novik.task4.view.TrainView;

/*
4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. Создайте массив из пяти элементов
типа Train, добавьте возможность сортировки элементов массива по номерам поездов. Добавьте возможность вывода информации о поезде, номер 
которого введен пользователем. Добавьте возможность сортировки массива по пункту назначения, причём поезда с одинаковыми пунктами 
назначения должны быть упорядочены по времени отправления.
*/


public class Main {

	public static void main(String[] args) {

		Train[] trains = new Train[5];
		
		trains[0] = new Train ("г. Гомель", 2, new Time(12, 45)); 
		trains[1] = new Train ("г. Гомель", 4, new Time(20, 00)); 
		trains[2] = new Train ("г. Витебск", 5, new Time(20, 15)); 
		trains[3] = new Train ("г. Гомель", 1, new Time(14, 15)); 
		trains[4] = new Train ("г. Брест", 3, new Time(8, 30)); 

		Depot depot = new Depot(trains);
		TrainView view = new TrainView();
		TrainLogic logic = new TrainLogic();
		
		

		
		System.out.println("Обычный вывод");
		view.showTrainsInDepot(depot);
		
		
		logic.sortByNumber(depot);
		System.out.println("");
		System.out.println("После сортировки по номеру");
		view.showTrainsInDepot(depot);
		
		
		System.out.println();
		System.out.println("Информация поезда указанного пользователем");
		view.showTrainInfoByNumber(depot);
		
		System.out.println();
		System.out.println("После сортировки по времени");
		logic.sortByTime(depot);
		view.showTrainsInDepot(depot);

		System.out.println();
		System.out.println("После сортировки по пункту назначения");
		logic.sortByDestination(depot);
		view.showTrainsInDepot(depot);

		System.out.println();
		System.out.println("После сортировки по пункту назначения и времени");
		logic.sortByDestinationAndTime(depot);
		view.showTrainsInDepot(depot);
		
		

	}

}
