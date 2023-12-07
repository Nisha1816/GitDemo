import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DialANumber {

	public static void main(String[] args) throws MalformedURLException {
//		DesiredCapabilities dc= new DesiredCapabilities();
//		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
//		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
//		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");
//		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Android");
//		dc.setCapability("appPackage","com.samsung.android.incallui");
//		dc.setCapability("appActivity","com.android.incallui.call.InCallActivity");
//		URL url= new URL("http://127.0.0.1:4723/wd/hub");
//		AndroidDriver driver=new AndroidDriver(url,dc);
		
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Android");
		
		dc.setCapability("appPackage","com.samsung.android.mdecservice");
		dc.setCapability("appActivity","com.android.incallui.call.InExternalCallActivity");
		URL url= new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,dc);
		
	}

}
