package class20;

public class SportTest {
    public static void main(String[] args) { // main method cause we want to test sport class

        Cricket crick=new Cricket("Cricket","Pakistan","Green helmet");

        crick.display();

        Soccer soc=new Soccer("Soccer","Argentina","Oliver's",12);
        soc.display();
        soc.displayTeam();




    }
}
