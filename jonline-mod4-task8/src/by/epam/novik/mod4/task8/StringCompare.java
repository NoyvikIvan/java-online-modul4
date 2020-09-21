package by.epam.novik.mod4.task8;

public class StringCompare {
	
	// Класс для сравнения строк с целью упорядочить по алфавиту.
	// Возращает 0 - если равны; 1 - если первая строка "больше", -1 - если вторая строка "больше". 
	
	public static int compare(String st1, String st2) {
		
		if (st1 == null && st2 == null) {
			return 0;
		}
		
		if (st1 == null) {
			return -1;
		}		
		
		if (st2 == null) {
			return 1;
		}
		
		if (st1.equals(st2)) {
			return 0;
		}
		
		
		int minLength = Math.min(st1.length(), st2.length());
				
		for (int i = 0; i < minLength; i++) {
			

			if (st1.charAt(i) > st2.charAt(i)) { 
				
				return 1;
				
			} else if (st1.charAt(i) < st2.charAt(i)) {
				
				return -1;

			}
		}
		
		return minLength == st1.length() ? -1 : 1;
		

		
	}

}
