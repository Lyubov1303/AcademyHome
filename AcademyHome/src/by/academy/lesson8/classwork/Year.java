package by.academy.lesson8.classwork;

public enum Year {
	SPRING (10, "SPR"), SUMMER(20, "SUMM"), AUTUMN (8, "AUM"), WINTER (-10, "WIN");
	
	private int temp;
	private String str;
	
	private Year(int temp, String str) {
		this.temp = temp;
		this.str = str;
	}

	public int getTemp() {
		return temp;
	}

	public String getStr() {
		return str;
	}
		
	
}
