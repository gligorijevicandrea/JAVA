package class25;

interface WashAble {
    public abstract void wash(); // all the methods are abstract and public in interface , we don't need to add abstract
}

class SmartWatch implements WashAble {


    @Override
    public void wash() {
        System.out.println("You can wash this smartwatch without any issues");
    }
}


class Phone implements WashAble {

    @Override
    public void wash() {
        System.out.println("I am IP65 Rated you can wash me");
    }
}

class Inverter implements WashAble{

    @Override
    public void wash() {
        System.out.println(" wash me");
    }
}