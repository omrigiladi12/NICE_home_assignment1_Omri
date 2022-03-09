import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class AllTimeLogins implements Nice_interface{
	private HashMap<Integer,YearLoggin>allTimeLogginDic;
	
	public AllTimeLogins() {		
		this.allTimeLogginDic = new HashMap<Integer,YearLoggin>();
	}
	
	public void parseAndCalc(String path)
	{
		MyDateAndTime myDateAndTime;
		OneLoginDetails oneLogginDetails;
		YearLoggin yearLoggin;
		int year,month,day,hour,minute,id;
				
		String [] idAndDateTime = new String [2];// Id and than "dateAndTime" object
		String [] dateAndTime = new String[2];// Date and than Time
		String [] hM = new String[2]; // Hours and than minutes
		String [] ymd = new String [3]; // Year, month, Day
		 try{   
	            FileInputStream fin= new FileInputStream(path);
	            BufferedReader reader = new BufferedReader(new InputStreamReader(fin));
	            while(reader.ready()) {	            	
	                String line = reader.readLine();
	                idAndDateTime = line.split(",");
	                dateAndTime = idAndDateTime[1].split(" ");
	                ymd = dateAndTime[0].split("/");
	                hM = dateAndTime[1].split(":");
	                day = Integer.parseInt(ymd[0]);
	                month = Integer.parseInt(ymd[1]);
	                year = Integer.parseInt(ymd[2]);
	                hour = Integer.parseInt(hM[0]);
	                minute = Integer.parseInt(hM[1]);
	                myDateAndTime = new MyDateAndTime(year,month,day,hour,minute);
	                id = Integer.parseInt(idAndDateTime[0]);
	                
	                oneLogginDetails = new OneLoginDetails(id, myDateAndTime);
	                	                		                	
                	if(!this.allTimeLogginDic.containsKey(year))
                	{
                		yearLoggin = new YearLoggin(year);
                		this.allTimeLogginDic.put(year, yearLoggin);	
                	}
                	
	                this.allTimeLogginDic.get(year).addValueToArray(oneLogginDetails);
	           }
	            fin.close();    
	          }catch(Exception e){System.out.println(e);}                    
	}
	public void printAllAciveDays()
	{
        for (Map.Entry<Integer,YearLoggin> entry : this.allTimeLogginDic.entrySet())
        {
        	entry.getValue().printActiveMonths();
        }
	}
	

	
}
