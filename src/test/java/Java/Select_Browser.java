package Java;

public class Select_Browser {

	public static void main(String[] args) {
		String browserName="chrome";
		int version=80;
		switch(browserName) 
		{
		case "chrome":System.out.println("User has selected Chrome browser");
			switch(version) 
			{
			case 80:System.out.println("Chrome version 80 is selected");
					break;
			case 85:System.out.println("Chrome version 85 is selected");
					break;
			default:System.out.println("Chrome version is not in List");
			}
		break;
		case "FF":System.out.println("User has selected Firefox Browser");
			switch(version)
			{
			case 80:System.out.println("Firefox version 80 is selected");
					break;
			case 90:System.out.println("Firefox version 90 is selected");
					break;
			default:System.out.println("Firefox version is not in list");
			}
		break;
		case "safari":System.out.println("User has selected safari Browser");
			switch(version)
			{
			case 80:System.out.println("Safari version 80 is selected");
					break;
			case 90:System.out.println("Safari version 90 is selected");
					break;
			default:System.out.println("Safari version is not in list");
			}
		break;
		case "IE11":System.out.println("User has selected Internet Explorer 11 Browser");
			switch(version)
			{
			case 80:System.out.println("IE11 version 80 is selected");
					break;
			case 90:System.out.println("IE11 version 90 is selected");
					break;
			default:System.out.println("IE11 version is not in list");
		}
		default:System.out.println("Selected browser is not in list");	
	}

}
}
