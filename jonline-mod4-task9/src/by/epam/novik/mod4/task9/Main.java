package by.epam.novik.mod4.task9;

//9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
//метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
//методами. Задать критерии выбора данных и вывести эти данные на консоль.
//Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
//Найти и вывести:
//a) список книг заданного автора;
//b) список книг, выпущенных заданным издательством;
//c) список книг, выпущенных после заданного года.



public class Main {

	public static void main(String[] args) {


		
		Book [] books = new Book[10];
		
		books[0] = new Book("1984", new String[] {"Джордж Оруэлл"}, "АСТ", 320, 2015, 1099, BindingType.SOFT);
		books[1] = new Book("Портрет Дориана Грея", new String[] {"Оскар Уайльд"}, "Эксмо", 352, 2019, 771, BindingType.HARD);
		books[2] = new Book("Идиот", new String[] {"Федор Достоевский"}, "Азбука", 640, 2012, 945, BindingType.SOFT);
		books[3] = new Book("Над пропастью во ржи", new String[] {"Джером Сэлинджер"}, "Эксмо", 272, 2016, 1217, BindingType.SOFT);
		books[4] = new Book("Убить пересмешника", new String[] {"Харпер Ли"}, "АСТ", 416, 2017, 1744, BindingType.HARD);
		books[5] = new Book("Одноэтажная Америка", new String[] {"Илья Ильф", "Евгений Петров"}, "АСТ", 480, 2017, 749, BindingType.SOFT);
		books[6] = new Book("Мертвые души", new String[] {"Николай Гоголь"}, "Эксмо", 320, 2019, 771, BindingType.HARD);
		books[7] = new Book("Пикник на обочине", new String[] {"Аркадий Стругацкий", "Борис Стругацкий"}, "АСТ", 168, 2019, 1064, BindingType.SOFT);
		books[8] = new Book("Трудно быть богом", new String[] {"Аркадий Стругацкий", "Борис Стругацкий"}, "АСТ", 256, 2018, 1199, BindingType.SOFT);
		//Book book = new Book("Над пропастью во ржи", new String[] {"Джером Сэлинджер"}, "Эксмо", 272, 2016, 1217, BindingType.SOFT);

		
		Library library = new Library(books);
		LibraryLogic logic = new LibraryLogic();
		LibraryView view = new LibraryView();
		
		Book [] newBooksList;
		Library newLibrary;
		
		String publishingHouse = "АСТ";
		String soughtAuthor = "Борис Стругацкий";
		int yearOfPublishing = 2017;
		
		
		System.out.println("Cписок книг, которые написал " + soughtAuthor);
		newBooksList = logic.getAutorsBookList(library, soughtAuthor);
		newLibrary = new Library(newBooksList);
		view.showBooksList(newLibrary);
		System.out.println();
		
		System.out.println("Cписок книг издательства " + publishingHouse);
		newBooksList = logic.getPublishingHouseBookList(library, publishingHouse);
		newLibrary = new Library(newBooksList);
		view.showBooksList(newLibrary);
		System.out.println();
		
		System.out.println("Cписок книг выпущенных после " + yearOfPublishing + " года");
		newBooksList = logic.getBooksAfterYearOfPublishing(library, yearOfPublishing);
		newLibrary = new Library(newBooksList);
		view.showBooksList(newLibrary);
		System.out.println();
		
		
		
		

		
	}

}
