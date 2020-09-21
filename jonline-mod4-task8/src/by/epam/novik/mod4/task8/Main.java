package by.epam.novik.mod4.task8;

/*
  Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы,
  set- и get- методы и метод toString(). Создать второй класс, агрегирующий массив типа
  Customer, с подходящими конструкторами и методами. Задать критерии выбора данных и
  вывести эти данные на консоль.
  
  	Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
  	Найти и вывести:
  	a) список покупателей в алфавитном порядке;
  	b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */

public class Main {

	public static void main(String[] args) {


		Customer customer1 = new Customer("Новик", "Иван", "Юрьевич", "г.Гомель", "1234567898767654", "40817810099910004312");
		Customer customer2 = new Customer("Новик", "Данила", "Иванович", "г.Гомель", "1111111111111111", "50817810099910004313");
		Customer customer3 = new Customer("Гапонов", "Иван", "Зольдович", "г.Гомель", "3334567898767652", "60817810099910004314");
		Customer customer4 = new Customer("Юнный", "Дмитрий", "Романович", "г.Минск", "9876543212345678", "70817810099910004315");
		Customer customer5 = new Customer("Беглый", "Николай", "Николаевич", "г.Слоним", "8234867898767658", "80817810099910004316");
		Customer customer6 = new Customer("Котов", "Кирил", "Юрьевич", "г.Пинск", "7234577798767777", "90817810099910004317");

		
		CustomerBase base = new CustomerBase(customer1, customer2, customer3, customer4, customer5, customer6);
		CustomerView view = new CustomerView();
		CustomerLogic logic = new CustomerLogic();
		
		view.printList(base.getCustomers());
		System.out.println("");
		
		Customer [] customers;
		customers = logic.sortAlphabetically(base.getCustomers());
		view.printList(customers);
		System.out.println("");

		customers = logic.findCustumersByCardNumberRange(customers, 1234567898767654L, 7234577798767777L);
		view.printList(customers);

		
	}

}
