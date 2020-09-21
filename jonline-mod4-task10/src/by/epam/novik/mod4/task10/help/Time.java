package by.epam.novik.mod4.task10.help;

//10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
//и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
//методами. Задать критерии выбора данных и вывести эти данные на консоль.
//Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
//Найти и вывести:
//a) список рейсов для заданного пункта назначения;
//b) список рейсов для заданного дня недели;
//c) список рейсов для заданного дня недели, время вылета для которых больше заданного.

public class Time {

	private int hour;
	private int min;

	public Time() {
		super();
	}

	public Time(int hour, int min) {
		super();
		this.hour = hour;
		this.min = min;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hour;
		result = prime * result + min;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		if (hour != other.hour)
			return false;
		if (min != other.min)
			return false;
		return true;
	}

	public boolean before(Time time) {

		if (hour < time.getHour()) {

			return true;

		} else if (hour == time.getHour()) {

			if (min < time.getMin()) {

				return true;
			}
		}

		return false;
	}

	public boolean after(Time time) {

		if (hour > time.getHour()) {

			return true;

		} else if (hour == time.getHour()) {

			if (min > time.getMin()) {

				return true;
			}
		}

		return false;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [hour=" + hour + ", min=" + min + "]";
	}

}
