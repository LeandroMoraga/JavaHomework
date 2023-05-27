package Project210Tasks;

public class ChromeDriver implements RemoteWebDriver{

    @Override
    public void navigate() {
        System.out.println("Navigating in Google Chrome");
    }

    @Override
    public void getScreenShot() {
        System.out.println("Getting Screenshot Successfully");
    }

    @Override
    public void open() {
        System.out.println("Opening Google Chrome");
    }

    @Override
    public void close() {
        System.out.println("Closing Google Chrome");
    }

    @Override
    public String getTitle(String title) {
        return title;
    }
}

class FirefoxDriver implements RemoteWebDriver{

    @Override
    public void navigate() {
        System.out.println("Navigating in Firefox");
    }

    @Override
    public void getScreenShot() {
        System.out.println("Getting Screenshot Successfully");
    }

    @Override
    public void open() {
        System.out.println("Opening Firefox");
    }

    @Override
    public void close() {
        System.out.println("Closing Firefox");
    }

    @Override
    public String getTitle(String title) {
        return title;
    }
}

class SafariDriver implements RemoteWebDriver{

    @Override
    public void navigate() {
        System.out.println("Navigating in Safari");
    }

    @Override
    public void getScreenShot() {
        System.out.println("Getting Screenshot Successfully");
    }

    @Override
    public void open() {
        System.out.println("Opening Safari");
    }

    @Override
    public void close() {
        System.out.println("Closing Safari");
    }

    @Override
    public String getTitle(String title) {
        return title;
    }
}