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

public class CustomerView {

	public void print(Customer customer) {

		if (customer != null) {

			System.out.println(customer.getFullName());

		} else {
			
			System.out.println("Переданы неверные параметры");
		}

	}

	public void printList(Customer[] customers) {

		if (customers != null) {

			for (int i = 0; i < customers.length; i++) {

				System.out.print((i + 1) + ") ");
				print(customers[i]);

			}
		} else {
			
			System.out.println("Переданы неверные параметры");
		}
	}

}
