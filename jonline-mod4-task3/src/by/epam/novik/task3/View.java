package by.epam.novik.task3;

//3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
//из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
//номеров групп студентов, имеющих оценки, равные только 9 или 10.

public class View {
	
	public void printStudentInfo(Student student) {
		
		String name = student.getFullName();
		int group = student.getGroupNumber();
		
		System.out.println(name + " из группы №" + group);
		
	}
	
	public void printExcellentStudent(Student[] students) {
		
		Logic logic = new Logic();
		int count = 0;
		System.out.println("Список студентов имеющих только оценки 9 и 10:");
		
		for (Student student : students) {

			if(logic.isExcellentStudent(student)) {
				
				printStudentInfo(student);
				count++;
			}
			
		}
		
		if (count == 0) {
			
			System.out.println("Студенты удовлетворяющие условию отсутствуют.");

		}
		
	}

}
