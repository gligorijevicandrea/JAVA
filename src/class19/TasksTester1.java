package class19;



public class TasksTester1 {
    public static void main(String[] args) {

        Tasks Alex=new Tasks("Alexander Friz","NRW Troisdorf Orchideen pl.44");
        Tasks Elisabeth=new Tasks("Elizabeth Ronalds","NY , NY West N 256");
        Tasks Alexis=new Tasks("Alexis Friz","New Jersey ,Marlboro ,Lincoln Cir. 55");

        Alex.stud();
        System.out.println("**");
        Elisabeth.stud();
        System.out.println("**");
        Alexis.stud();
        System.out.println("**");


        Tasks HarryPotter =new Tasks("Harry Potter","Fantasy","J.K.Rowling");
        Tasks Metro2033 =new Tasks("Metro 2033","Horror,Science Fiction","Dmitri Glukhovsky");
        Tasks Law =new Tasks("Constitutional Law And Politics: Civil Rights And Civil Liberties","Law & Politics","David M. O'Brien");

        HarryPotter.book();
        System.out.println("***");
        Metro2033.book();
        System.out.println("+++++++++++++++++++++++++++");
        Law.book();


    }
}
