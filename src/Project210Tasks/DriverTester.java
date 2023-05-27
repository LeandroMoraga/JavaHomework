package Project210Tasks;

public class DriverTester {
    public static void main(String[] args) {
        ChromeDriver chromeDriver= new ChromeDriver();
        chromeDriver.open();
        chromeDriver.navigate();
        chromeDriver.getScreenShot();
        chromeDriver.getTitle("Syntax Technologies");
        chromeDriver.close();
        System.out.println();
        FirefoxDriver firefoxDriver= new FirefoxDriver();
        firefoxDriver.open();
        firefoxDriver.navigate();
        firefoxDriver.getScreenShot();
        firefoxDriver.getTitle("Youtube");
        firefoxDriver.close();
        System.out.println();
        SafariDriver safariDriver= new SafariDriver();
        safariDriver.open();
        safariDriver.navigate();
        safariDriver.getScreenShot();
        safariDriver.getTitle("Google");
        safariDriver.close();
    }
}
