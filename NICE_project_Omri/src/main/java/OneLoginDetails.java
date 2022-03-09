public class OneLoginDetails {
	private int id;
	private MyDateAndTime mdat;
	
	
	public OneLoginDetails()
	{
		this.id = 0;
		mdat = new MyDateAndTime();
	}
	public OneLoginDetails(int id, MyDateAndTime mdat)
	{
		this.id = id;
		this.mdat = mdat;
	}
	
	public int getId()
	{
		return this.id;
	}
	
	public MyDateAndTime getMdat()
	{
		return this.mdat;
	}

}
