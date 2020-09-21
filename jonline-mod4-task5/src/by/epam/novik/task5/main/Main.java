package by.epam.novik.task5.main;

import by.epam.novik.task5.counter.Counter;

//5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
//на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
//произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
//позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.

public class Main {

	public static void main(String[] args) {

		Counter counter1 = new Counter();
		
		Counter counter2 = new Counter(5, 0, 9);
		Counter counter3 = new Counter(10, 0, 9);
		Counter counter4 = new Counter(-9, 0, 9);
		Counter counter5 = new Counter(5, 9, 0);
		Counter counter6 = new Counter(-6, 9, -1);

		System.out.println(counter1);
		System.out.println("5, 0, 9  " + counter2);
		System.out.println("10, 0, 9  " + counter3);
		System.out.println("-9, 0, 9  " + counter4);
		System.out.println("5, 9, 0  " + counter5);
		System.out.println("-6, 9, -1  " + counter6);
		
		
		System.out.println(counter1.getCounterValue() + " - текущее состояние счетчика1");

		//увеличения состояния счетчика
		counter1.counterUp();
		
		System.out.println(counter1.getCounterValue() + " - текущее состояние счетчика1 после увеличения");

		//уменьшение состояния счетчика
		counter1.counterDown();
		
		System.out.println(counter1.getCounterValue() + " - текущее состояние счетчика1 после уменьшения");
		//уменьшение состояния счетчика
		counter1.counterDown();
		
		System.out.println(counter1.getCounterValue() + " - текущее состояние счетчика1 после уменьшения");
	}

}
