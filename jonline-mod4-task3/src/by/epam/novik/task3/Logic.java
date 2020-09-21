package by.epam.novik.task3;


//3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
//из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
//номеров групп студентов, имеющих оценки, равные только 9 или 10.


public class Logic {
	
	public boolean isExcellentStudent(Student student) {
		
		int[] performance = student.getPerformance();
		
		for (int i = 0; i < performance.length; i++) {
			
			if (performance[i] != 9 && performance[i] != 10) {
				
				return false;
			}
		}
		return true;
		
	}
	
	
	

}
