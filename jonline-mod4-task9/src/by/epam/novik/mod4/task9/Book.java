package by.epam.novik.mod4.task9;

import java.util.Arrays;

//9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
//метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
//методами. Задать критерии выбора данных и вывести эти данные на консоль.
//Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
//Найти и вывести:
//a) список книг заданного автора;
//b) список книг, выпущенных заданным издательством;
//c) список книг, выпущенных после заданного года.


public class Book {
	
	
	private static int idCounter = 1;
	
	
	private int id;
	private String title;
	private String [] authors;
	private String publishingHouse;
	private int numberOfPages;
	private int yearOfPublishing;
	private int price;
	private BindingType bindingType;
	
	
	
	public Book() {
		super();
		id = idCounter++;
	}

	public Book(String title, String[] authors, String publishingHouse, int numberOfPages, int yearOfPublishing, int price,
			BindingType bindingType) {
		super();
		id = idCounter++;
		this.title = title;
		this.authors = authors;
		this.publishingHouse = publishingHouse;
		this.numberOfPages = numberOfPages;
		this.yearOfPublishing = yearOfPublishing;
		this.price = price;
		this.bindingType = bindingType;
	}

	public int getId() {
		return id;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String[] getAuthors() {
		return authors;
	}

	public void setAuthors(String[] authors) {
		this.authors = authors;
	}

	public String getPublishingHouse() {
		return publishingHouse;
	}

	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}
	
	public int getNumberOfPages() {
		return numberOfPages;
	}
	
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public int getYearOfPublishing() {
		return yearOfPublishing;
	}

	public void setYearOfPublishing(int yearOfPublishing) {
		this.yearOfPublishing = yearOfPublishing;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public BindingType getBindingType() {
		return bindingType;
	}

	public void setBindingType(BindingType bindingType) {
		this.bindingType = bindingType;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [id=" + id + ", title=" + title + ", authors=" + Arrays.toString(authors) + ", publishingHouse="
				+ publishingHouse + ", numberOfPages=" + numberOfPages + ", yearOfPublishing=" + yearOfPublishing + ", price=" + price + ", bindingType="
				+ bindingType + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(authors);
		result = prime * result + ((bindingType == null) ? 0 : bindingType.hashCode());
		result = prime * result + id;
		result = prime * result + price;
		result = prime * result + ((publishingHouse == null) ? 0 : publishingHouse.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + yearOfPublishing;
		result = prime * result + numberOfPages;
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
		Book other = (Book) obj;
		if (!Arrays.equals(authors, other.authors))
			return false;
		if (bindingType != other.bindingType)
			return false;
		if (id != other.id)
			return false;
		if (price != other.price)
			return false;
		if (numberOfPages != other.numberOfPages)
			return false;
		if (publishingHouse == null) {
			if (other.publishingHouse != null)
				return false;
		} else if (!publishingHouse.equals(other.publishingHouse))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (yearOfPublishing != other.yearOfPublishing)
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	
}
