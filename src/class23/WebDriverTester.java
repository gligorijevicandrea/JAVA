package class23;

public class WebDriverTester {
    public static void main(String[] args) {
     /*                       //  changing the browser name / object name class Safari, Firefox, Google Chrome
        WebDriver webDriver=new Firefox(); // Up casting
        // Firefox fireFox=new WenDriver(); down casting
        webDriver.startBrowser();
        webDriver.openURL();
        webDriver.testLoginPage();
        webDriver.closeBrowser(); */

 //  Array of type parent class = holds objects of all child classes
        WebDriver[]browsers={new Chrome(),new Safari(),new Firefox()};  // POLYMORPHISM - MANY FORMS

        //  we want to access all the objects one by one from array

        for(WebDriver browser:browsers){
            browser.startBrowser();
            browser.openURL();
            browser.testLoginPage();
            browser.closeBrowser();
        }

    }
}
