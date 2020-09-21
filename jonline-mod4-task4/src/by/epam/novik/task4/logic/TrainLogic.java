package by.epam.novik.task4.logic;

import java.util.Scanner;

import by.epam.novik.task4.help.Time;
import by.epam.novik.task4.train.Depot;
import by.epam.novik.task4.train.Train;
import by.epam.novik.task4.help.StringCompare;

/*
4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. Создайте массив из пяти элементов
типа Train, добавьте возможность сортировки элементов массива по номерам поездов. Добавьте возможность вывода информации о поезде, номер 
которого введен пользователем. Добавьте возможность сортировки массива по пункту назначения, причём поезда с одинаковыми пунктами 
назначения должны быть упорядочены по времени отправления.
*/

public class TrainLogic {

	public void sortByNumber(Depot depot) {

		Train[] trains = depot.getTrains();
		int trainCount = trains.length;

		int minTrainNumber;
		int minTrainPosition;
		int trainNumber;
		Train tmp;

		for (int j = 0; j < trainCount; j++) {

			minTrainNumber = trains[j].getTrainNumber();
			minTrainPosition = j;

			for (int i = j; i < trainCount; i++) {

				trainNumber = trains[i].getTrainNumber();

				if (trainNumber < minTrainNumber) {

					minTrainNumber = trainNumber;
					minTrainPosition = i;
				}

			}

			tmp = trains[j];
			trains[j] = trains[minTrainPosition];
			trains[minTrainPosition] = tmp;

		}

	}

	public int getUserChoise(String comment) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int tmp;

		do {

			System.out.println(comment);

			while (!sc.hasNextInt()) {

				sc.nextLine();
				System.out.println(comment);

			}

			tmp = sc.nextInt();

		} while (tmp < 0);

		return tmp;

	}

	public Train findTrainByNumber(Depot depot, int number) {

		Train[] trains = depot.getTrains();

		for (Train train : trains) {

			if (train.getTrainNumber() == number) {

				return train;
			}
		}

		return null;

	}

	public void sortByTime(Depot depot) {

		Train[] trains = depot.getTrains();
		int trainCount = trains.length;

		Time minTime;
		int minTrainPosition;
		Time trainDepartureTime;
		Train tmp;

		for (int j = 0; j < trainCount; j++) {

			minTime = trains[j].getDepartureTime();
			minTrainPosition = j;

			for (int i = j; i < trainCount; i++) {

				trainDepartureTime = trains[i].getDepartureTime();

				if (trainDepartureTime.before(minTime)) {

					minTime = trainDepartureTime;
					minTrainPosition = i;
				}

			}

			tmp = trains[j];
			trains[j] = trains[minTrainPosition];
			trains[minTrainPosition] = tmp;

		}

	}

	public void sortByDestination(Depot depot) {

		Train[] trains = depot.getTrains();
		int trainCount = trains.length;

		String minDestination;
		int minTrainPosition;
		String trainDestination;
		Train tmp;

		for (int j = 0; j < trainCount; j++) {

			minDestination = trains[j].getDestination();
			minTrainPosition = j;

			for (int i = j; i < trainCount; i++) {

				trainDestination = trains[i].getDestination();

				if (StringCompare.compare(trainDestination, minDestination) == -1) {

					minDestination = trainDestination;
					minTrainPosition = i;
				}

			}

			tmp = trains[j];
			trains[j] = trains[minTrainPosition];
			trains[minTrainPosition] = tmp;

		}

	}

	public void sortByDestinationAndTime(Depot depot) {

		sortByDestination(depot);

		Train[] trains = depot.getTrains();
		int trainCount = trains.length;
		String destination;
		String nextDestination;
		int count;
		Train[] tr;
		Depot tmp;

		for (int j = 0; j + 1 < trainCount; j++) {

			destination = trains[j].getDestination();
			nextDestination = trains[j + 1].getDestination();
			count = 1;

			if (destination.equals(nextDestination)) {


				for (int i = j + count++; i + 1 < trains.length; i++) {

					nextDestination = trains[i].getDestination();

					if (destination.equals(nextDestination)) {
						count++;

					} else {
						break;
					}
				}
			}

			if (count > 1) {

				tr = new Train[count];

				for (int i = j, k = 0; i < j + count; i++, k++) {
					tr[k] = trains[i];
				}

				tmp = new Depot(tr);

				sortByTime(tmp);

				for (int i = j, k = 0; i < j + count; i++, k++) {
					trains[i] = tr[k];
				}

				j = j + count - 1;

			}

		}

	}

}
