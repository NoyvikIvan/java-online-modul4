package by.epam.novik.test1;


//1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
//переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
//наибольшее значение из этих двух переменных.

public class Test1 {

	private int gold;
	private int silver;

	public Test1() {
		super();
		gold = (int) (Math.random() * 10);
		silver = (int) (Math.random() * 100);
	}

	public Test1(int gold, int silver) {
		super();
		this.gold = gold;
		this.silver = silver;
	}

	public void print() {
		System.out.println("Золото: " + gold);
		System.out.println("Серебро: " + silver);
	}

	public void setGold(int gold) {
		this.gold = gold;
	}

	public void setSilver(int silver) {
		this.silver = silver;
	}

	public int sum() {
		return gold + silver;
	}

	public int max() {

		return gold >= silver ? gold : silver;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + gold;
		result = prime * result + silver;
		return result;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj) {
			return true;
		}

		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}

		Test1 other = (Test1) obj;

		if (gold != other.gold || silver != other.silver) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Test1 [gold=" + gold + ", silver=" + silver + "]";
	}

	
	
}
