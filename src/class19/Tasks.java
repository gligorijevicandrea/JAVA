package class19;

public class Tasks {

    String StudentName;
    String Address;

    String BookName;
    String BookGenre;

    String BookAuthor;

    Tasks (String StudentName,String Address){
        this.StudentName=StudentName;
        this.Address=Address;
    }

    Tasks(String BookName,String BookGenre,String BookAuthor){
        this.BookName=BookName;
        this.BookGenre=BookGenre;
        this.BookAuthor=BookAuthor;


    }
    public void stud(){
        System.out.println("First Name - "+StudentName+"\n"+"Last Name - "+Address);
    }
    public void book() {
        System.out.println("BookName: " + BookName + "\n" + "Genre: " + BookGenre + "\n" + "Author: " + BookAuthor);
    }

    public static void main(String[] args) {


        //StringBuilder();
        //StringBuilder("Hello");
    }
}
