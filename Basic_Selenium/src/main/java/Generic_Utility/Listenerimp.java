package Generic_Utility;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

import com.google.protobuf.ByteString.Output;

public class Listenerimp implements ITestNGListener{
	public void onTestFailure(ITestResult result)
	{
		TakesScreenshot takescreenshot = (TakesScreenshot) BaseClass.sDriver;
	
		File src = takescreenshot.getScreenshotAs(OutputType.FILE);
		File dst = new File("./FailedScripts.png");
		try {
			FileUtils.copyFile(src, dst);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
