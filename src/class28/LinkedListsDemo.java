package class28;

import java.util.LinkedList;

public class LinkedListsDemo {
    public static void main(String[] args) {


        LinkedList<String> names=new LinkedList<>();
        names.add("Artem");
        names.add("Elvira");
        names.add("Tammana");
        names.add("Temmuz");
        names.add("Sam");
        System.out.println(names);


        for(int i=0; i< names.size(); i++){
            System.out.println(names.get(i));
        }


        int i=0;
        while(i< names.size()){
            System.out.println(names.get(i));
            i++;
        }


        for(String name:names){
            System.out.println(names);
        }

    }
}
