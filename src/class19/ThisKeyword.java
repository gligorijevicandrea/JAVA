package class19;

public class ThisKeyword {

    int a,b;

    ThisKeyword(int a,int b){
        this.a=a;
        this.b=b;
    }

    void hello(){
        System.out.println("hello");
    }
    void howAreYou(){
        System.out.println("how are you");
    }

    public void sum(int a,int b){
        System.out.println(a+b);
    }

    void greetings(){
        hello();
        howAreYou();
    }


    public static void main(String[] args) {
        ThisKeyword obj=new ThisKeyword(10,20);
        System.out.println(obj.a);

        obj.sum(100,200);

        obj.greetings();
    }
}
