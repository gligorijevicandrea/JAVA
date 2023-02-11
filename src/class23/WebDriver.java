package class23;

public class WebDriver {

    public void startBrowser(){
        System.out.println("starting the browser");
    }

    public void openURL(){
        System.out.println("opening a url");
    }

    public void testLoginPage(){
        System.out.println("checking if login page works");
    }

    public void closeBrowser(){
        System.out.println("closing the browser");
    }

}

class Chrome extends WebDriver{
    @Override
    public void startBrowser() {
        super.startBrowser();
        System.out.println("Starting Google Chrome");
    }

    @Override
    public void openURL() {
        super.openURL();
        System.out.println("Opening the url in Google Chrome");
    }

    @Override
    public void testLoginPage() {
        super.testLoginPage();
        System.out.println("Testing the login page in Chrome");
    }

    @Override
    public void closeBrowser() {
        super.closeBrowser();
        System.out.println("closing the Google Chrome");
    }
}


class Safari extends WebDriver{

    @Override
    public void startBrowser() {
        System.out.println("Opening the Safari Browser");
    }

    @Override
    public void openURL() {
        System.out.println("Opening the Url in Safari");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page in Safari");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Safari");
    }
}

class Firefox extends WebDriver{

    @Override
    public void startBrowser() {
        System.out.println("Opening the Firefox Browser");
    }

    @Override
    public void openURL() {
        System.out.println("Opening the Url in Firefox");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page in Firefox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Firefox");
    }
}