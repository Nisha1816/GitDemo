GIT is name of technology version control system which is open source and GITHUB is a web based hosting service for GIT repository
even you can also setup GIT in your local machine too but it has limitation that you can only work on that machine
if GIT is hosted on server then you can access source code any time from anywhere

package Java;

public class CodeStuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        driver.manage().window().maximize();
	    driver.switchTo().newWindow(WindowType.WINDOW).get("https://facebook.com/");
	    driver.get("https://www.google.com/");
		// Opens a new window and switches to new window
		driver.switchTo().newWindow(WindowType.WINDOW);
		// Opens BrowserStack homepage in the newly opened window
		driver.navigate().to("https://www.browserstack.com/");
		//Sample code snippet to open a new tab within the same window
		driver.get("https://www.google.com/");
		// Opens a new tab in existing window
		driver.switchTo().newWindow(WindowType.TAB);
		// Opens Browserstack homepage in the newly opened tab
		driver.navigate().to("https://www.browserstack.com/");

		//1.Id
			WebElement email_ele = driver.findElement(By.id("email"));
			email_ele.sendKeys("seleniumtraining@mailinator.com");
	
				
		//2.Name
			WebElement password_ele = driver.findElement(By.id("pass"));
			password_ele.sendKeys("TestPassword");
				
		//3.xpath
			WebElement showpassword_ele = driver.findElement(By.xpath("//input[@id='pass']//..//div//a//div//div"));
			showpassword_ele.click();
				
		//4.Link Text
			WebElement forgotten_Password_link = driver.findElement(By.linkText("Forgotten password?"));
			forgotten_Password_link.click();
				
		//5.Partial Link Text
			WebElement cancel = driver.findElement(By.partialLinkText("Canc"));
			cancel.click();
				
		//6. CSS Selector
			WebElement email = driver.findElement(By.cssSelector("input#email"));
			email.sendKeys("CSSSelector@mailinator.com");
			
			WebElement password = driver.findElement(By.cssSelector("input[placeholder='Password']"));
			password.sendKeys("CssLocator");
				
		//7.TagName
			List<WebElement> dob = driver.findElements(By.tagName("select"));
			for(int i = 0 ; i < dob.size()-1 ; i++) {
				dob.get(i).click();
			}
				
		//8.Class Name
				WebElement cart = driver.findElement(By.className("cart_text"));

//		Types of CSS Selectors (with examples)
//		There are 5 types of CSS Selectors in Selenium tests-
		
//		●	ID
//		●	Class
//		●	Attribute
//		●	Sub-String
//		●	Inner String
//		1)css=<HTML tag><#><Value of ID attribute>
//		2)css=<HTML tag><.><Value of Class attribute>
//		3)Css = input[aria-label="Email address or phone number"]
// 
		
		XPath = //input[@id='user-message'] 
		WebElement username = driver.findElement(By.xpath("//input[@id='user-message']"));
		
		Absolute XPath = /html/body/div/div/form/input
		WebElement userName = driver.findElement(By.xapth("/html/body/div/div/form/input"));
		
		Relative XPath = //input[@class='social-media'] 
		WebElement username = driver.findElement(By.xpath("//input[@class='social-media']"));
		
		//XPath Contains
        XPath: //tagname[contains(@attribute, 'value')]
        XPath: //button[contains(@name, 'websubmit')]	
        	
        //XPath starts- with
        XPath: //input[starts-with(@name, 'keyword')]
        	
//      XPath Ends-with
        XPath: //tagname[ends-with(@attribute, 'value')]
        
//      Using “OR” Statement
        XPath(login button): //input[@value = 'Log In' or @type = 'submit']
        	
//      Using “AND” Statement
        XPath: //button[@type = 'submit' and @id = 'u_0_19']
        
//      XPath Text
        XPath : //div[text() = 'Recent logins']
        
//      13 XPath axes methods in Selenium WebDriver
       //
//      1.	Child Axis
        Syntax:
               //child::tagName

        XPath ://span[@class = 'worldwide__list']//child::a
        XPath ://span[@class = 'worldwide__list']//child::a[1]  
        	
//      2. Parent Axis
        Syntax:
               //parent::tagName

        XPath : //input[@id = 'text']//parent::span
        XPath : //input[@id = 'text']//parent::*
        XPath : //input[@id = 'text']//..
        	
//      3. Self Axis:
        Syntax:
                //self::tagName
        XPath: //input[@id = 'text']//self::input 
        XPath(Current node): //input[@id = 'text']//self::*
        XPath(Current node): //input[@id = 'text']//.
        
//      4. Ancestor Axis:
        	The ancestor axis selects all ancestor elements (parent, grandparent, great-grandparents, etc.) 
        Syntax:
               //ancestor::tagName
        XPath: //button[@name='login']//ancestor::div
        	
//      5. Ancestor-or-self Axis:
        Syntax:
               //ancestor-or-self::tagName
        XPath: //button[@name='login']//ancestor-or-self::button
        
//      6. Descendant Axis:
        Syntax:
        	   //descendant::tagName
        XPath: //div[@class = 'signup_form new']//descendant::input
        	
//      7. Descendant-or-self Axis:
        Syntax:
               //descendant-or-self::tagName
        XPath: //div[@class = 'signup_form new']//descendant-or-self::input 
        
//      8. Following Axis:
//      The following axis selects all elements (nodes) in the document after the closing tag of the current node
        Syntax:
            //following::tagName
        XPath://input[@name="firstname"]//following::input
        
//      9. Following-sibling Axis:
//      The following-sibling selects all sibling nodes after the current node at the same level
        Syntax:
            //following::tagName
        XPath(Radio button)://label[text()='Female']//following-sibling::input
        
//       10. Preceding Axis:
//       The preceding axis selects all nodes that come before the current node in the document, except ancestor, attribute nodes, and namespace nodes
         XPath://button[@name="login"]//preceding::input
        	
//       11. Preceding-sibling Axis:
         XPath: //a[text() = 'Videos']//preceding-sibling::a
        
//       12 Attribute Axis:
         XPath(Login): //button[@name="login"]
         XPath(Login)://button[attribute::name="login"]
        	 
//       13 Namespace Axis:
         XPath: //html[@xmlns="http://www.w3.org/1999/xhtml"]
         
//       To open new Tabs :
//       Method 1:
         driver.switchTo().newWindow(WindowType.TAB);
		 driver.get("https://facebook.com/");
//		 Method 2:
		 Robot robot = new Robot();
		// Press CTRL+T
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_T);
			 
		 robot.keyRelease(KeyEvent.VK_CONTROL);
		 robot.keyRelease(KeyEvent.VK_T);
			 
		 driver.get("https://facebook.com/");
//		 Method 3
		 JavascriptExecutor js;
		 js = (JavascriptExecutor) driver;
		 js.executeScript("window.open();");
//		 To open new Windows :
		 //
//	     Method 1:
	     driver.switchTo().newWindow(WindowType.Window);
		 driver.get("https://facebook.com/");
//		 Method 2:
		 Robot robot = new Robot();
		 // Press CTRL+N
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_N);
		 robot.keyRelease(KeyEvent.VK_CONTROL);
		 robot.keyRelease(KeyEvent.VK_N);
		 driver.get("https://facebook.com/");
		
		 driver.getWindowHandle();
		 driver.getWindowHandles();
		 
		 public static void MovetoTab(int Tab) {
				ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
				driver.switchTo().window(tabs.get(Tab));
			}
		 
		 
		 
		


		 
	        




        
        
        
        
      


        	

        



	}

}
