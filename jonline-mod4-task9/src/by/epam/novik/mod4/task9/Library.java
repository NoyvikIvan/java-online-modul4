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

public class Library {

	private Book[] books;
	private int size = 0;

	public Library() {

		books = new Book[10];

	}

	public Library(Book... books) {
		super();

		if (books != null && books.length != 0) {

			int lenght;

			lenght = books.length * 2;

			this.books = new Book[lenght];

			for (int i = 0; i < books.length; i++) {

				this.books[i] = books[i];
				size++;
			}

		} else {

			this.books = new Book[10];

		}

	}

	public int size() {

		return size;

	}

	public Book[] getBooks() {

		Book[] books = new Book[size];

		for (int i = 0; i < books.length; i++) {

			books[i] = this.books[i];

		}

		return books;

	}

	public void addBook(Book book) {

		if (size == books.length) {

			Book[] tmp = new Book[size * 2];

			for (int i = 0; i < books.length; i++) {

				tmp[i] = books[i];

			}

			books = tmp;

		}

		books[size] = book;
		size++;

	}

	public boolean pickUpBook(Book book) {

		if (findBook(book)) {

			for (int i = 0; i < size; i++) {

				if (books[i].equals(book)) {

					pickUpBook(i);
					return true;

				}
			}
		}

		return false;

	}

	public void pickUpBook(int position) {

		if (position <= size && position >= 0) {

			size--;

			for (int i = position; i < size; i++) {

				books[i] = books[i + 1];

			}
		}
	}

	public boolean findBook(Book book) {

		if (book == null) {
			return false;
		}

		for (Book tmp : books) {

			if (book.equals(tmp)) {
				return true;
			}
		}

		return false;

	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [books=" + Arrays.toString(books) + ", size=" + size + "]";
	}

}
