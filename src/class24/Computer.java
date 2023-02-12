package class24;

public class Computer {
    /*
    /Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
    Define common behavior within and some fields in parent class and override some of the methods in child classes
    Define some methods specific to child classes
    Create objects of child classes and store them into array. Loop through each object and execute available methods./
     */

    int RAM;
    int storage;
    String OS;


    void playVideo() {
        System.out.println("Video is playing");
    }

    void browseInternet() {
        System.out.println("Browse the internet");
    }
}


    class Apple extends Computer{
        @Override
        void playVideo() {
            System.out.println("Playing on quick player");
        }

        @Override
        void browseInternet() {
            System.out.println("Browsing using safari");
        }

        void editVideos(){
            System.out.println("Editing in iMovies");
        }

        void installApp(){
            System.out.println("installing the apps from App store");
        }

    }

class HP extends Computer{

    @Override
    void browseInternet() {
        System.out.println("Browsing using Chrome");
    }

    @Override
    void playVideo() {
        System.out.println("playing using VLC player");
    }
}
