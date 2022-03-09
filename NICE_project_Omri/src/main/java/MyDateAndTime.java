
public class MyDateAndTime {
	private int day;
	private int month;
	private int year;
	private int hour;
	private int minutes;
	
	public MyDateAndTime(int year, int month, int day, int hour, int minutes)
	{
		this.day =day;
		this.month = month;
		this.year = year;
		this.hour=hour;
		this.minutes=minutes;		
	}
	public MyDateAndTime()
	{
		this.day =0;
		this.month = 0;
		this.year = 0;
		this.hour=0;
		this.minutes=0;
	}
	
	public int getYear()
	{
		return this.year;
		
	}
	public int getMonth()
	{
		return this.month;
		
	}
	public int getDay()
	{
		return this.day;
		
	}
	public int getHour()
	{
		return this.hour;
		
	}
	public int getMinutes()
	{
		return this.minutes;
		
	}
	public boolean sameDate(MyDateAndTime other)
	{
		return (this.day == other.getDay() && this.month == other.getMonth() && this.year == other.getYear());
	}
	
		
}
