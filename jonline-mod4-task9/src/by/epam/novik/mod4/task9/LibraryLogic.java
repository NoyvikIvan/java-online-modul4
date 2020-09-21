package by.epam.novik.mod4.task9;

//9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и

//метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
//методами. Задать критерии выбора данных и вывести эти данные на консоль.
//Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
//Найти и вывести:
//a) список книг заданного автора;
//b) список книг, выпущенных заданным издательством;
//c) список книг, выпущенных после заданного года.

public class LibraryLogic {
	
	// метод находит и возвращает (из библиотеки) список книг заданного автора

	public Book[] getAutorsBookList(Library library, String soughtAuthor) {

		if (library == null || soughtAuthor == null) {

			return new Book[0];

		}

		Library tmp = new Library();
		Book[] books = library.getBooks();

		for (int i = 0; i < library.size(); i++) {

			if (books[i] != null) {

				String[] autors = books[i].getAuthors();

				for (String author : autors) {

					if (author.equals(soughtAuthor)) {

						tmp.addBook(books[i]);
						break;

					}
				}
			}
		}

		return tmp.getBooks();

	}
	
	
	// метод находит и возвращает (из библиотеки) список книг, выпущенных заданным издательством


	public Book[] getPublishingHouseBookList(Library library, String publishingHouse) {

		if (library == null || publishingHouse == null) {

			return new Book[0];

		}

		Library tmp = new Library();
		Book[] books = library.getBooks();

		for (int i = 0; i < books.length; i++) {
			
			if (books[i] != null && publishingHouse.equals(books[i].getPublishingHouse())) {

				tmp.addBook(books[i]);

			}
		}

		return tmp.getBooks();

	}
	
	
	
	// метод находит и возвращает (из библиотеки) список книг, выпущенных после заданного года


	public Book[] getBooksAfterYearOfPublishing(Library library, int yearOfPublishing) {

		if (library == null || yearOfPublishing > 2020 || yearOfPublishing < 1) {

			return new Book[0];

		}

		Library tmp = new Library();
		Book[] books = library.getBooks();

		for (int i = 0; i < books.length; i++) {

			if (books[i] != null && books[i].getYearOfPublishing() > yearOfPublishing) {

				tmp.addBook(books[i]);

			}
		}

		return tmp.getBooks();

	}

}
