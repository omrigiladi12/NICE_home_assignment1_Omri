
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class AllDayLogins {
	private int totalNumOfLoginInADay;
	private List<OneLoginDetails> allDayLogiinsLst;
	private HashSet<Integer> usersHash;
	public AllDayLogins()
	{
		this.totalNumOfLoginInADay=0;	
		this.allDayLogiinsLst = new LinkedList<OneLoginDetails>();
		this.usersHash = new HashSet<Integer>();
	}
	public AllDayLogins(int totalNumOfLoginInADay, List<OneLoginDetails> allDayLogiinsLst)
	{
		this.totalNumOfLoginInADay=totalNumOfLoginInADay;	
		this.allDayLogiinsLst = allDayLogiinsLst;
		this.usersHash = new HashSet<Integer>();
	}
	
	public int getTotalNumOfLoginInADay()
	{
		return this.totalNumOfLoginInADay;
	}
	public void setTotalNumOfLoginInADay(int totalNumOfLoginInADay)
	{
		this.totalNumOfLoginInADay =totalNumOfLoginInADay;
	}
	public  List<OneLoginDetails> getAllDayLogiinsLst()
	{
		return this.allDayLogiinsLst;
	}
	public void setAllDayLogiinsArr( List<OneLoginDetails>  allDayLogiinsLst)
	{
		this.allDayLogiinsLst = allDayLogiinsLst;
	}
	public void addElementToTheList(OneLoginDetails oldElement)
	{
		if(!this.usersHash.contains(oldElement.getId()))
		{
				usersHash.add(oldElement.getId());
				this.totalNumOfLoginInADay++;
		}
		this.allDayLogiinsLst.add(oldElement);
	}
	public void printUsersInADay(int day,int month,int year)
	{
		System.out.println("Date:" +day + "/" +month + "/"+year +", DAU:" + totalNumOfLoginInADay);
	}
}

