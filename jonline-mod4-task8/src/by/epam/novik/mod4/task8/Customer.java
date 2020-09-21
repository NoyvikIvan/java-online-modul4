package by.epam.novik.mod4.task8;

/*
Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы,
set- и get- методы и метод toString(). Создать второй класс, агрегирующий массив типа
Customer, с подходящими конструкторами и методами. Задать критерии выбора данных и
вывести эти данные на консоль.

	Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
	Найти и вывести:
	a) список покупателей в алфавитном порядке;
	b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
*/


public class Customer {
	
		private static int count = 1;
		private static final String DEFAULT_CREDIT_CARD_NUMBER = null;
		private static final String DEFAULT_BANK_ACCOUNT_NUMBER = null;
		private static final String DEFAULT_FIELD = "Unknown";

	 
	    private int id;
	    private String lastName;
	    private String firstName;
	    private String secondName;
	    private String address;
	    private String creditCardNumber;
	    private String bankAccountNumber;

	    public Customer(String lastName, String firstName, String secondName, String address, String creditCard, String bankAccount) {

	        this.lastName = lastName;
	        this.firstName = firstName;
	        this.secondName = secondName;
	        this.address = address;
	        this.creditCardNumber = creditCard;
	        this.bankAccountNumber = bankAccount;

	        id = count++;

	    }
	    
	    public Customer(String lastName, String firstName, String secondName, String address) {

	        id = count++;

	        this.lastName = lastName;
	        this.firstName = firstName;
	        this.secondName = secondName;
	        this.address = address;
	        this.creditCardNumber = DEFAULT_CREDIT_CARD_NUMBER;
	        this.bankAccountNumber = DEFAULT_BANK_ACCOUNT_NUMBER;


	    }
	    
	    public Customer() {

	        id = count++;

	        this.lastName = DEFAULT_FIELD;
	        this.firstName = DEFAULT_FIELD;
	        this.secondName = DEFAULT_FIELD;
	        this.address = DEFAULT_FIELD;
	        this.creditCardNumber = DEFAULT_CREDIT_CARD_NUMBER;
	        this.bankAccountNumber = DEFAULT_BANK_ACCOUNT_NUMBER;

	    }
	    
	    
	    public int getId() {
	    	
	    	return id;
	    }
	    
	    
	    public String getLastName() {
	        return lastName;
	    }

	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }

	    public String getFirstName() {
	        return firstName;
	    }

	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }

	    public String getSecondName() {
	        return secondName;
	    }

	    public void setSecondName(String secondName) {
	        this.secondName = secondName;
	    }

	    public String getAddress() {
	        return address;
	    }

	    public void setAddress(String address) {
	        this.address = address;
	    }

	    public String getCreditCardNumber() {
	        return creditCardNumber;
	    }

	    public void setCreditCardNumber(String creditCardNumber) {
	        this.creditCardNumber = creditCardNumber;
	    }

	    public String getBankAccountNumber() {
	        return bankAccountNumber;
	    }

	    public void setBankAccountNumber(String bankAccountNumber) {
	        this.bankAccountNumber = bankAccountNumber;
	    }

	    
	    public String getFullName() {
	    	
	        return lastName + " " + firstName + " " + secondName;
	    }
	    
	    
	    
	    @Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((address == null) ? 0 : address.hashCode());
			result = prime * result + ((bankAccountNumber == null) ? 0 : bankAccountNumber.hashCode());
			result = prime * result + ((creditCardNumber == null) ? 0 : creditCardNumber.hashCode());
			result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
			result = prime * result + id;
			result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
			result = prime * result + ((secondName == null) ? 0 : secondName.hashCode());
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
			Customer other = (Customer) obj;
			if (address == null) {
				if (other.address != null)
					return false;
			} else if (!address.equals(other.address))
				return false;
			if (bankAccountNumber == null) {
				if (other.bankAccountNumber != null)
					return false;
			} else if (!bankAccountNumber.equals(other.bankAccountNumber))
				return false;
			if (creditCardNumber == null) {
				if (other.creditCardNumber != null)
					return false;
			} else if (!creditCardNumber.equals(other.creditCardNumber))
				return false;
			if (firstName == null) {
				if (other.firstName != null)
					return false;
			} else if (!firstName.equals(other.firstName))
				return false;
			if (id != other.id)
				return false;
			if (lastName == null) {
				if (other.lastName != null)
					return false;
			} else if (!lastName.equals(other.lastName))
				return false;
			if (secondName == null) {
				if (other.secondName != null)
					return false;
			} else if (!secondName.equals(other.secondName))
				return false;
			return true;
		}

		public String toString() {
	        return this.getClass().getSimpleName() + ": " + lastName + " " + firstName + " " + secondName + "\n"
	        		+ "Проживает по адресу: " + address + ".\n"
	        		+ "Номер кредитной карты: " + creditCardNumber + "\n"
	        		+ "Банковсчий счет №" + bankAccountNumber;
	    }

}
