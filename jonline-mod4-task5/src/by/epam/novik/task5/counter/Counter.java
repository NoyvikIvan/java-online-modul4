package by.epam.novik.task5.counter;

//5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
//на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
//произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
//позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.

public class Counter {
	
	private int counterValue;
	private int maxСounterValue;
	private int minСounterValue;
	
	public Counter() {
		counterValue = 0;
		maxСounterValue = 359;
		minСounterValue = 0;
	}

	public Counter(int counterValue, int maxСounterValue, int minСounterValue) {
		super();
		
		int validMaxСounterValue = 0;
		int validMinСounterValue = 0;
		int validCounterValue = counterValue;


		
		if (maxСounterValue < minСounterValue) {
			
			validMaxСounterValue = minСounterValue;
			validMinСounterValue = maxСounterValue;
			
			
		} else {
			
			validMaxСounterValue = maxСounterValue;
			validMinСounterValue = minСounterValue;

		}
		
		if (counterValue > validMaxСounterValue || counterValue < validMinСounterValue) {
			
			validCounterValue = validMinСounterValue;
			
			
		} 
		this.counterValue = validCounterValue;
		this.maxСounterValue = validMaxСounterValue;
		this.minСounterValue = validMinСounterValue;
	}

	public int getCounterValue() {
		return counterValue;
	}

	public void setCounterValue(int counterValue) {
		
		int validCounterValue = counterValue;
		
		if (counterValue > maxСounterValue || counterValue < minСounterValue) {
			
			validCounterValue = minСounterValue;
			
		} 
		
		this.counterValue = validCounterValue;
		
	}

	public int getMaxСounterValue() {
		return maxСounterValue;
	}

	public void setMaxСounterValue(int maxСounterValue) {
		this.maxСounterValue = maxСounterValue;
	}

	public int getMinСounterValue() {
		return minСounterValue;
	}

	public void setMinСounterValue(int minСounterValue) {
		this.minСounterValue = minСounterValue;
	}
	
	public void counterUp() {
		
		counterValue++;
		
		if (counterValue > maxСounterValue) {
			
			counterValue = minСounterValue;
		}
	}

	
	public void counterDown() {
		
		counterValue--;
		
		if (counterValue < minСounterValue) {
			
			counterValue = maxСounterValue;
		}
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [counterValue=" + counterValue + ", minСounterValue=" + minСounterValue + ", maxСounterValue="
				+ maxСounterValue + "]";
	}
	
	
	

}
