package class19;

public class Donkey {

    String name;

    int age;

    double weight;

    /*Donkey(){
        System.out.println("This is a none argument constructor");
    }*/

   /* Donkey(String DonkeyName,int DonkeyAge){
        name=DonkeyName;
        age=DonkeyAge;
    }*/

    Donkey(String name,int age){
        this.name=name;         //  this. - differentiates the variables
        this.age=age;
    }

    void print(){
        System.out.println("Donkey's Name is:"+name+" Age is: "+age+" and weight is: "+weight);
    }
}
