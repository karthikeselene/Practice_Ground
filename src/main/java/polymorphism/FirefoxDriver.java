package polymorphism;

public class FirefoxDriver extends RemoteWebDriver {
	
	public void get(String url) {
		System.out.println("Launched given url "+url+" in the firefox browser");
	}

}