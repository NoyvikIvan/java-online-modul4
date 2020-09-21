package by.epam.novik.mod4.task9;


//9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
//метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
//методами. Задать критерии выбора данных и вывести эти данные на консоль.
//Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
//Найти и вывести:
//a) список книг заданного автора;
//b) список книг, выпущенных заданным издательством;
//c) список книг, выпущенных после заданного года.


public class LibraryView {
	
	
	public void showBooksList(Library library) {

		if (library != null) {

			Book[] books = library.getBooks();
			
			for (Book book : books) {
				
				System.out.println(book);
			}

		} else {
			
			System.out.println("Библиотека пуста");
			
		}


	}

	

}
