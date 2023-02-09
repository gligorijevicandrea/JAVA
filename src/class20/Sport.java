package class20;

public class Sport {

    String name;
    String country;

    // Sport is constructor
    Sport(String name, String country){
        this.name=name;
        this.country=country;
    }

    public void display(){  // method void
        System.out.println(name+" is played in "+country);
    }

}

class Cricket extends Sport{

   String helmet; // instance variable

    // Cricket is constructor
    Cricket(String name, String country ,String helmet){   // parameters constructor , it has values inside()
        super(name,country); // using SUPER we are referring to parent class , always first line
        this.helmet=helmet; // using THIS we are referring to the current class
    }

}

class Soccer extends Sport{

    String team; // variable
    int numberOfPlayers; // variable

    // constructor Soccer (String name , String country from parent class , than tring team , int numberOfPlayer)is from this class
    Soccer(String name, String country, String team , int numberOfPlayers){ // we need to add this String team , int numOFPly

        super(name, country); // refers to parent class
        this.team=team; // refers to this class
        this.numberOfPlayers=numberOfPlayers; // refers to this class

    }
    void displayTeam(){  // method void
        System.out.println(team+" consist of "+numberOfPlayers+" players");
    }



}