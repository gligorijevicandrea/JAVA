package class24;

public class FileTester {
    public static void main(String[] args) {

        // there is no object because we added abstract in File class
        File[]arr={new JavaFile(1024),new WordFile(25), new PdfFile(50)};


        /*
        for(File file:arr){
            file.edit();
            file.open();
            file.close();


        } */

        for (int i = 0; i < arr.length; i++) {
            File f=arr[i];
            f.open();
            f.edit();
            f.close();

        }


    }
}
