import java.util.HashSet;
import java.util.Iterator;

public class YearLoggin {
	private static final int numberOfMonthsInYear =13;
	private int yearNum;
	private AllMonthLogin [] twelveMonthsArr;
	private HashSet<Integer> activeMonths;
	
	public YearLoggin()
	{
		this.setYearNum(0) ;
		this.twelveMonthsArr = new AllMonthLogin [numberOfMonthsInYear];
		for(int i = 0 ; i<numberOfMonthsInYear ;i++)
			this.twelveMonthsArr[i] = new AllMonthLogin();
		this.activeMonths = new HashSet<Integer>();
	}
	
	public YearLoggin(int yearNum)
	{
		this.setYearNum(yearNum);
		this.twelveMonthsArr = new AllMonthLogin[numberOfMonthsInYear];
		for(int i = 0 ; i<numberOfMonthsInYear ;i++)
			this.twelveMonthsArr[i] = new AllMonthLogin();
		this.activeMonths = new HashSet<Integer>();
	}
	
	public AllMonthLogin[] getTwelveMonthsArr()
	{
		return this.twelveMonthsArr;
	}
	
	public void setYearArr(AllMonthLogin [] twelveMonthsArr)
	{
		 this.twelveMonthsArr = twelveMonthsArr;
	}
	public void addValueToArray(OneLoginDetails oneLogginDetails)
	{
		AllMonthLogin allMonthlogin = this.twelveMonthsArr[oneLogginDetails.getMdat().getMonth()];
		allMonthlogin.addToSpecificDay(oneLogginDetails);
		if(!this.activeMonths.contains(oneLogginDetails.getMdat().getMonth()))
			this.activeMonths.add(oneLogginDetails.getMdat().getMonth());
	}

	public int getYearNum() {
		return this.yearNum;
	}

	public void setYearNum(int yearNum) {
		this.yearNum = yearNum;
	}
	
	public HashSet<Integer> getActiveMonthshash() {
		return this.activeMonths;
	}

	public void setActiveMonthshash(HashSet<Integer> activeMonths) {
		this.activeMonths = activeMonths;
	}
	public void printActiveMonths() {  
	    	for (Integer ele : this.activeMonths) {        
	            this.twelveMonthsArr[ele].printActiveDays(ele,this.yearNum);
	        }
		
	}
	
}
