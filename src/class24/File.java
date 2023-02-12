package class24;

public abstract   class File {
    /*
    Create a class File that will have the following behaviors: open, edit, close.
    Edit and close are implemented method while open is an abstract.
    Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour:
     Example: to open .java file we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc
     */
    int size;
    File(int size){
        this.size=size;
    }

     abstract void open();  // abstract means there is no implementation in method


     void edit(){
         System.out.println("editing the file");
     }
     void close(){
         System.out.println("closing the file");
     }

}

class JavaFile extends File {
    JavaFile(int size) {
        super(size);
    }

    @Override
    void open() {
        System.out.println("to open java file we need notepad++");
    }

    @Override
    void edit() {
        System.out.println("editing the file in Intelij");
    }
}

class WordFile extends File {
    WordFile(int size) {
        super(size);
    }

    @Override
    void open() {
        System.out.println("to open .doc file we need Microsoft");
    }
}

class PdfFile extends File {
    PdfFile(int size) {
        super(size);
    }

    @Override
    void open() {
        System.out.println("to open pdf file we need Adobe");
    }
}