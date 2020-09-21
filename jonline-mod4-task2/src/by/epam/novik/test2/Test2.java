package by.epam.novik.test2;

//2. Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте
//конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра
//класса.

public class Test2 {
	
	private static final String NO_NAME = "Unknown";
	
	private String name;
	private int assessment;
	
	
	
	public Test2() {
		super();
		name = NO_NAME;
		assessment = (int) (Math.random() * 10);
	}
	
	public Test2(String name, int assessment) {
		super();
		this.name = name;
		this.assessment = assessment;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public int getAssessment() {
		return assessment;
	}


	public void setAssessment(int assessment) {
		this.assessment = assessment;
	}


	public static void main(String[] args) {
		
		Test2 t = new Test2();
		Test2 t2 = new Test2("Заиц", 7);
		
		System.out.println("Первое имя - " + t.getName());
		
		t.setName("Cat");
		
		System.out.println("Первое имя после изменения - " + t.getName());

		System.out.println("Второе имя - " + t2.getName());
		System.out.println("Первая оценка - " + t.getAssessment());
		System.out.println("Вторая оценка - " + t2.getAssessment());

		
	}
	

}
