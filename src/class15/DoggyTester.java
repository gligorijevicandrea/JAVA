package class15;

public class DoggyTester {
    public static void main(String[] args) {

        System.out.println("Start");
        Doggy dog=new Doggy();
        dog.printFood();
        System.out.println("end");

        for (int i = 0; i < 2; i++) {
            System.out.println(i);
        }
    }
}
