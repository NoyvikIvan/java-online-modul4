package by.epam.novik.test1;

public class Main {

	public static void main(String[] args) {

		Test1 tst1 = new Test1();
		Test1 tst2 = new Test1();
		Test1 tst3 = new Test1(42, 111);

		tst2.print();
		System.out.println("");

		tst2.setGold(10);
		tst2.setSilver(42);
		tst2.print();
		
		System.out.println("");

		tst1.print();
		int sum1 = tst1.sum();
		System.out.println("Сумма: " + sum1);
		
		System.out.println("");
		tst3.print();
		int max = tst3.max();
		System.out.println("Максимум: " + max);

		

	}

}
