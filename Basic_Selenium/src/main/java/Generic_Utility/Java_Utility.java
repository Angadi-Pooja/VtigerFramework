package Generic_Utility;

import java.util.Random;

public class Java_Utility {
	/**
	 * This method is used to avoid duplicates
	 * @author Pooja
	 * @return
	 */
	
	public int getRandomNum()
	{
		Random ran = new Random();
		int ranNUM = ran.nextInt(1000);
		return ranNUM;
	}

}
