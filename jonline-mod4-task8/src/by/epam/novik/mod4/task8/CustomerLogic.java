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

public class CustomerLogic {
	
	// метод возращает новый массив старых клиентов, ссылки в котором расположены в алфовитном порядке

	public Customer[] sortAlphabetically(Customer[] customers) {
		
		if (customers == null) {
			return null;
		}

		int customerCount = customers.length;

		Customer[] tmp = new Customer[customerCount];

		String minFullName;
		String customerFullName;
		String previousFullName;
		String maxFullName;

		minFullName = customers[0].getFullName();
		maxFullName = maxFullName(customers);
		previousFullName = "";

		for (int j = 0; j < customerCount;) {

			for (int i = 0; i < customerCount; i++) {

				if (j != 0) {
					previousFullName = tmp[j - 1].getFullName();
				}
				customerFullName = customers[i].getFullName();

				if (StringCompare.compare(customerFullName, minFullName) == -1					//находит (условно) минимальный элемент из исходного массива
						&& StringCompare.compare(customerFullName, previousFullName) == 1) {	// с условием, что этот элемент будет (условно) больше последнего из нового массива.
																								// защита от повторений
					minFullName = customerFullName;

				}

			}

			for (Customer customer : customers) {					//	добовляет всех клиентов с идентичными ФИО
				if (customer.getFullName().equals(minFullName)) {
					tmp[j] = customer;
					j++;
				}

			}

			minFullName = maxFullName;

		}

		return tmp;

	}

	public String maxFullName(Customer[] customers) {
		
		if (customers == null) {
			return null;
		}

		String customerLastName;
		String maxName = customers[0].getFullName();

		for (Customer customer : customers) {

			customerLastName = customer.getFullName();

			if (StringCompare.compare(customerLastName, maxName) == 1) {

				maxName = customerLastName;

			}
		}

		return maxName;
	}

	//Возвращает количество покупателей, у которых номер кредитной карточки находится в заданном интервале 
	public int countCustumersWithCardNumberRange(Customer[] customers, Long start, Long finish) {

		if (customers == null) {
			return 0;
		}
		
		int count = 0;

		for (int i = 0; i < customers.length; i++) {
			long cardNumber = Long.parseLong(customers[i].getCreditCardNumber());
			if (cardNumber >= start && cardNumber <= finish) {
				count++;
			}
		}

		return count;
	}
	
	
	//возвращает новый список с сылками на старых покупателей, у которых номер кредитной карточки находится в заданном интервале

	public Customer[] findCustumersByCardNumberRange(Customer[] customers, Long start, Long finish) {
		
		if (customers == null) {
			return null;
		}

		int count = countCustumersWithCardNumberRange(customers, start, finish);
		Customer[] tmp = new Customer[count];
		int position = 0;

		for (int i = 0; i < customers.length; i++) {
			
			long cardNumber = Long.parseLong(customers[i].getCreditCardNumber());
			
			if (cardNumber >= start && cardNumber <= finish) {
				
				tmp[position] = customers[i];
				position++;
				
			}
		}

		return tmp;
	}

}
