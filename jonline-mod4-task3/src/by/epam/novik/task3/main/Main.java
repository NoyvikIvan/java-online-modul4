package by.epam.novik.task3.main;

import by.epam.novik.task3.Student;
import by.epam.novik.task3.View;




//3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
//из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
//номеров групп студентов, имеющих оценки, равные только 9 или 10.


public class Main {

	public static void main(String[] args) {
		
		Student[] students = new Student[10];
		
		students[0] = new Student(1, "Новик И.Ю.", 10, 10, 10, 10, 10);
		students[1] = new Student(1, "Заиц А.Н.", 9, 10, 9, 10, 9);
		students[2] = new Student(1, "Гайманов С.Ю.", 9, 9, 9, 9, 9);
		students[3] = new Student(2, "Царков С.В.", 8, 9, 9, 8, 8);
		students[4] = new Student(2, "Майоров И.И.", 8, 7, 9, 8, 9);
		students[5] = new Student(2, "Гопиков И.Д.", 7, 8, 6, 5, 8);
		students[6] = new Student(3, "Пец Д.Р.", 4, 7, 6, 9, 4);
		students[7] = new Student(3, "Левкович С.Н.", 6, 6, 6, 7, 8);
		students[8] = new Student(3, "Капкстин А.В.", 9, 9, 9, 10, 9);
		students[9] = new Student(3, "Савич А.В.", 3, 4, 4, 5, 4);

		View view = new View();
		
		view.printExcellentStudent(students);
		
		
		
	}
	
	

}
