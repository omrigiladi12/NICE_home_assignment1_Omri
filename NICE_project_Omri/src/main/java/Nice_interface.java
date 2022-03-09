
public interface Nice_interface {
	
	/**
	* parseAndCalc Function:
	* Parsing the file's data and saving the data in the data structure,
 	* Filling also the number of users logged in each day.
 	* @param path - the full path of the input file for example:"C:\\Users\\omrig\\eclipse-workspace\\NICE_project_Omri\\input.txt"
	*/
	public void parseAndCalc(String path);
	
	/**
	* printAllAciveDays Function:
	* Searching for the relevant days 
	* And printing to the screen the number of users that were logged in in each day
	*/
	public void printAllAciveDays();
}
