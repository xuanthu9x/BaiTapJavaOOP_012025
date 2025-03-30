package bai3.common;

public class BaseTest {
    // + Tạo class "BaseTest" để tạo hàm createDriver và closeDriver
    public void createDiver(String browser, boolean report, boolean headless)
    {
        System.out.println("Browser: " + browser);
        System.out.println("Report: "+ report);
        System.out.println("Headless: "+ headless);
        System.out.println("Create drive");
    }

    public void closeDrive(String browser){
        System.out.println("Close browser: " + browser);
    }
}
