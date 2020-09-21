package by.epam.novik.time;

//6. Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
//изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
//недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
//заданное количество часов, минут и секунд.

public class Main {

	public static void main(String[] args) {

		Time t = new Time();
		Time n = new Time(12, 30, 30);
		
		System.out.println("Первое время - " + t);
		System.out.println("Второе время - " + n);
		
		System.out.println("Добавляем к первому времени 29 минут и 9604 секунд к второму ");
		t.add(29, "min");
		n.add(9604);
		
		System.out.println(t);
		System.out.println(n);
		
		
		System.out.println("Отнимаем от второго времени 2 часа");
		n.addHour(-2);
		n.printTime();
		
		System.out.println("Прокручиваем второе время на 48 минут назад");
		n.rollMin(-48);
		n.printTime();
		
		System.out.println("Проверяем защиту");
		t.add(15, "ежик");
		
		System.out.println("в цикле отнимаем 99 секунд от первого времени");
		for (int i = 0; i < 20; i++) {
			t.add(-99, Time.SEC);
			t.printTime();		}
		

	}
	
	

}
