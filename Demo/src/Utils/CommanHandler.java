package Utils;

public class CommanHandler {

	public static String getRandomString(int size)
	{
		return Long.toHexString(Double.doubleToLongBits(Math.random()));	
	}
	
		
}
