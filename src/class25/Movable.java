package class25;

public interface Movable {
    void move(); //  considers abstract even we don't add it

}

interface OwnAble{
    void own();
}

class Car implements Movable, OwnAble{ // we can implement 2 classes but we have to add all methods from those classes
    @Override
    public void move() {
        System.out.println("I can move");
    }

    @Override
    public void own() {

    }
}

class Dog implements WashAble,OwnAble{
    @Override
    public void wash() {
        System.out.println("i can move");
    }

    @Override
    public void own() {
        System.out.println("you can own me");
    }
}