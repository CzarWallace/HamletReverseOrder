package AssignmentHamlet;


    import java.io.File;
import java.io.FileNotFoundException;
    import java.util.LinkedList;
    import java.util.Scanner;


    public class ReadHamlet {
        public static void main(String[] args) {
            try {
                File file = new File("src/FileIODemo/hamlet.txt");

                try (Scanner scanner = new Scanner(file);) {
                    while (scanner.hasNextLine()) {
                        String line = scanner.nextLine();
                        System.out.println(line);
                    }
                }
            }catch(FileNotFoundException e){
                System.out.println("Error. ");
                e.printStackTrace();
            }

            System.out.println(HamletReverseOrder(Reverse));
        }


        //(2) reverse order

        public  ReadHamlet HamletInReverseOrder(String Reverse){
            String  output = new ReadHamlet();
            for(Integer element: Reverse){
                output.add(element);
            }
            return output;
        }
        }



