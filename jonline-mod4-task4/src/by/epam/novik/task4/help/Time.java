package by.epam.novik.task4.help;

/*
4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. Создайте массив из пяти элементов
типа Train, добавьте возможность сортировки элементов массива по номерам поездов. Добавьте возможность вывода информации о поезде, номер 
которого введен пользователем. Добавьте возможность сортировки массива по пункту назначения, причём поезда с одинаковыми пунктами 
назначения должны быть упорядочены по времени отправления.
*/

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
	
	

}
