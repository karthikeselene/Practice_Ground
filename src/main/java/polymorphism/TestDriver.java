package polymorphism;

public class TestDriver {

	public static void main(String[] args) {
		RemoteWebDriver rwd = new RemoteWebDriver();
		rwd.get("https://www.google.com/");
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
	}

}
