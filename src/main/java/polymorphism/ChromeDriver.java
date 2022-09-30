package polymorphism;

public class ChromeDriver extends RemoteWebDriver {
	
	public void get(String url) {
		System.out.println("Launched given url "+url+" in the chrome browser");
	}

}