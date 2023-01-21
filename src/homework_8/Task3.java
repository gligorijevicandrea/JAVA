package homework_8;

public class Task3 {
    public static void main(String[] args) {

        //  Create a 2D array(shorter way) in which first array will consist of 4 names and second array will contain grades.
        //  Then your program should print name of the students that has A and B grade

        String [][]school={ {"Sam","Tom","Andy","Una"},
                            {"A","B","C","D"}
        };

        for (int i = 0; i < school.length; i++) {  // 2 rows of array school

            for (int j = 0; j < school[i].length; j++) {  // values with [i] from school array

                if(school[i][j].equals("A") || school[i][j].equals("B") ){

                    System.out.println(school[0][j]);
                }

            }

        }

        System.out.println("*******************");

        String[][] names={{"Michael","C"},{"Jackson","B"},{"Harrison","B"},{"Ford","A"}};


        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                if(i!=0) {
                    System.out.println(names[i][j]);
                }

            }
        }








    }
}
