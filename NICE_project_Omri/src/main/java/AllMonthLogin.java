import java.util.HashSet;
import java.util.Iterator;

public class AllMonthLogin {
	private static final int numberOfdaysInMonth =32;
	private AllDayLogins [] daysArr;
	private HashSet<Integer> activeDays;
	
	public AllMonthLogin() {
		
		this.daysArr = new AllDayLogins[numberOfdaysInMonth];	
		for(int i = 0 ; i<numberOfdaysInMonth ;i++)
			this.daysArr[i] = new AllDayLogins();
		this.activeDays = new HashSet<Integer>();
	}
	public AllDayLogins [] getAllDaysLoginArr() {
		return this.daysArr;
	}
	public void getAllDaysLoginArr(AllDayLogins [] daysArr) {
		this.daysArr = daysArr;
	}
	public void addToSpecificDay (OneLoginDetails old) {
		this.daysArr[old.getMdat().getDay()].addElementToTheList(old);
		
		if(!this.activeDays.contains(old.getMdat().getDay()))
			this.activeDays.add(old.getMdat().getDay());
	}
	public HashSet<Integer> getActiveDaysList() {
		return this.activeDays;
	}
	public void setActiveDaysList(HashSet<Integer> activeDays ) {
		this.activeDays = activeDays;
	}
	public void printActiveDays(int month,int year) {		  
    	for (Integer ele : this.activeDays) {        
            this.daysArr[ele].printUsersInADay(ele,month,year);
        }
	}
}
