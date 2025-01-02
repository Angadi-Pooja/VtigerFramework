package Generic_Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class File_Utility {
	public String getKeyandValuepair(String key) throws Throwable
	{
		FileInputStream fis = new FileInputStream(IPathConstant.filepath);
		Properties pro = new Properties();
		pro.load(fis);
		String value = pro.getProperty(key);
		return value;
	}

}
