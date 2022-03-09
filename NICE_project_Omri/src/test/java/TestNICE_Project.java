import org.testng.annotations.Test;

public class TestNICE_Project {
	public static void main(String[] args)
	{
		TestNICE_Project testNice = new TestNICE_Project();
		testNice.testNICE_project();
	}

	@Test
	public void testNICE_project() {
		System.out.println("***Test of input file number 0:***");
		AllTimeLogins atl = new AllTimeLogins();
		atl.parseAndCalc("C:\\Users\\omrig\\eclipse-workspace\\NICE_project_Omri\\input.txt");
		atl.printAllAciveDays();
		System.out.println("***Test of input file number 1:***");
		atl.parseAndCalc("C:\\Users\\omrig\\eclipse-workspace\\NICE_project_Omri\\input1.txt");
		atl.printAllAciveDays();
		
		System.out.println("im in the test frame");

	}
	
} 
