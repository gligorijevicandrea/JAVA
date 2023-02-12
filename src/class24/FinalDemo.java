package class24;

public class FinalDemo {
    public static void main(String[] args) {

        final int num; // we have created a constant variable
        num = 20;
        // num=30; not possible because variable is declared final
    }
        final void noOneShoulOverrideIt(){
            System.out.println("this methos should never be overriden or it will break code base");
        }
    }
class Nelson extends FinalDemo{
    /*final void noOneShoulOverrideIt(){  // can't override this method as it is declared as final
        System.out.println("let me do that");
    } */

}







