package by.epam.novik.task3;

import java.util.Arrays;

//3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
//из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
//номеров групп студентов, имеющих оценки, равные только 9 или 10.

public class Student {

	private String fullName;
	private int groupNumber;
	private int[] performance = new int[5];

	
	
	public Student(String fullName, int groupNamber, int[] performance) {
		super();
		this.fullName = fullName;
		this.groupNumber = groupNamber;
		this.performance = performance;
	}
	

	public Student(int groupNamber, String fullName, int performance1, int performance2, int performance3, int performance4, int performance5) {
		super();
		this.fullName = fullName;
		this.groupNumber = groupNamber;
		performance[0] = performance1;
		performance[1] = performance2;
		performance[2] = performance3;
		performance[3] = performance4;
		performance[4] = performance5;

	}


	public Student() {
		super();
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getGroupNumber() {
		return groupNumber;
	}

	public void setGroupNumber(int groupNumber) {
		this.groupNumber = groupNumber;
	}

	public int[] getPerformance() {
		return performance;
	}

	public void setPerformance(int[] performance) {
		this.performance = performance;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fullName == null) ? 0 : fullName.hashCode());
		result = prime * result + groupNumber;
		result = prime * result + Arrays.hashCode(performance);
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
		Student other = (Student) obj;
		if (fullName == null) {
			if (other.fullName != null)
				return false;
		} else if (!fullName.equals(other.fullName))
			return false;
		if (groupNumber != other.groupNumber)
			return false;
		if (!Arrays.equals(performance, other.performance))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() +" [fullName=" + fullName + ", groupNumber=" + groupNumber + ", performance="
				+ Arrays.toString(performance) + "]";
	}

}
