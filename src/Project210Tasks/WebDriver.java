package Project210Tasks;

public interface WebDriver {
    void open();
    void close();
    String getTitle(String title);
}

interface TakeScreenshot {
    void getScreenShot();
}


interface RemoteWebDriver extends WebDriver,TakeScreenshot{

    void navigate();
}
