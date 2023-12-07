import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class MessageApp {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Android");
		dc.setCapability("appPackage","com.samsung.android.messaging");
		dc.setCapability("appActivity","com.samsung.android.withtalk.ui.composer.ComposerActivity");
		URL url= new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,dc);
		driver.findElement(By.id("android:id/sem_tip_popup_message")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("com.samsung.android.messaging:id/fab")).click();
		driver.findElement(By.id("com.samsung.android.messaging:id/recipients_editor_to")).sendKeys("9408672007");
		driver.findElement(By.id("com.samsung.android.messaging:id/message_edit_text")).sendKeys("Hello Nisha!!");
		driver.findElement(By.id("com.samsung.android.messaging:id/send_button1")).click();
		Thread.sleep(10000);

	}

}
