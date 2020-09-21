package by.epam.novik.time;

//6. Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
//изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
//недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
//заданное количество часов, минут и секунд.

public class Time {

	private static final int MAX_HOUR = 24;
	private static final int MAX_MIN = 60;
	private static final int MAX_SEC = 60;

	public static final String SEC = "sec";
	public static final String MIN = "min";
	public static final String HOUR = "hour";

	private int hour;
	private int min;
	private int sec;

	
	
	public Time() {
		
		this(0, 0, 0);

	}

	public Time(int hour) {
		
		this(hour, 0, 0);

	}

	public Time(int hour, int min) {
		
		this(hour, min, 0);

	}

	public Time(int hour, int min, int sec) {
		
		super();

		this.setHour(hour);
		this.setMin(min);
		this.setSec(sec);

	}

	//Гетеры и сетеры с проверкой допустимости значений
	
	
	public int getHour() {
		
		return hour;
		
	}

	
	public void setHour(int hour) {
		
		if (hour < 0 || hour >= MAX_HOUR) {
			
			hour = 0;
		}
		
		this.hour = hour;
	}

	
	public int getMin() {
		
		return min;
	}

	
	public void setMin(int min) {
		
		if (min < 0 || min >= MAX_MIN) {
			
			min = 0;
			
		}
		
		this.min = min;
	}

	
	public int getSec() {
		
		return sec;
		
	}
	

	public void setSec(int sec) {
		
		if (sec < 0 || sec >= MAX_SEC) {
			
			sec = 0;
		}
		
		this.sec = sec;
	}
	
	
	// методы преобразования время в секунды и секунды в время
	
	public static Time secToTime(int sec) {
		
		if (sec <= 0 || sec >= MAX_HOUR * MAX_MIN * MAX_SEC) {
			
			return new Time();
			
		}
		
		int min = sec / MAX_SEC;
		int hour = min / MAX_MIN;

		sec = sec % MAX_SEC;
		min = min % MAX_MIN;
		
		return new Time(hour, min, sec);

	}
	
	public int timeToSec() {
		
		int hourToSec = this.hour  * MAX_MIN * MAX_SEC;
		int minToSec = this.min * MAX_SEC;
		int sec = this.sec;
		
		return hourToSec + minToSec + sec;

	}
	
	
	//методы изменения времени на заданное количество часов, минут и секунд.
	//с переходами по разрядам

	public void addHour(int hour) {
		
		hour = this.hour + hour;
		
		if (hour >= MAX_HOUR || hour < 0) {
			
			this.hour = 0;
			this.min = 0;
			this.sec = 0;

		} else {
			
			this.setHour(hour);
		}
	}

	public void addMin(int min) {
		
		int minInSec = min * MAX_SEC;
		this.add(minInSec);
		
	}
	
	
	public void add(int sec) {
		
		int thisTaimInSec = this.timeToSec();
		int newTimeInSec = thisTaimInSec + sec;
		
		Time newTime = Time.secToTime(newTimeInSec);
		
		this.hour = newTime.hour;
		this.min = newTime.min;
		this.sec = newTime.sec;

	}
	
	
	public void add(Time time) {
		
		if (time == null) {
			
			System.out.println("Метод не сработал, введены неверные данные");

		} else {
			
			int thisTaimInSec = this.timeToSec();
			int addingTimeInSec = time.timeToSec();
			int newTimeInSec = thisTaimInSec + addingTimeInSec;
			
			Time newTime = Time.secToTime(newTimeInSec);
			
			this.hour = newTime.hour;
			this.min = newTime.min;
			this.sec = newTime.sec;
			
		}

	}
	
	
	public void add(int hour, int min, int sec) {
		
		int hourToSec = hour  * MAX_MIN * MAX_SEC;
		int minToSec = min * MAX_SEC;
		
		int time = hourToSec + minToSec + sec;
		
		this.add(time);

	}


	public void add(int time, String category) {
		
		if (category == null) {
			
			System.out.println("Метод не сработал, введены неверные данные");
			
		} else {
			
			switch (category) {
			
			case HOUR: {
				
				this.addHour(time);
				break;
			}
			
			case MIN: {
				
				this.addMin(time);
				break;
			}
			
			case SEC: {
				
				this.add(time);
				break;
			}
			
			default: {
				
				System.out.println("Метод не сработал, введены неверные данные");
			}
			}
		}
	}


	

	//Методы прокрутки времени без перехода по разрядам
	

	
	public void rollSec(int sec) {
		
		sec = this.sec + sec;
		sec = sec % MAX_SEC;
		
		if (sec >= 0) {
			
			this.sec = sec;		
			
		} else {
			
			this.sec = MAX_SEC + sec;			
		}
	}
	
	
	public void rollMin(int min) {
		
		min = this.min + min;
		min = min % MAX_MIN;
		
		if (min >= 0) {
			
			this.min = min;		
			
		} else {
			
			this.min = MAX_MIN + min;			
		}
	
	}
	
	
	public void rollHour(int hour) {
		
		hour = this.hour + hour;
		hour = hour % MAX_HOUR;
		
		if (hour >= 0) {
			
			this.hour = hour;	
			
		} else {
			
			this.hour = MAX_HOUR + hour;			
		}
	
	}
	
	
	
	// метод вывода 
	
	public void printTime () {
		
		System.out.println("[" + this.hour + ":" + this.min + ":" + this.sec + "]");
		
	}

	
	@Override
	public String toString() {
		
		return this.getClass().getSimpleName() + " [hour=" + hour + ", min=" + min + ", sec=" + sec + "]";
		
	}

}
