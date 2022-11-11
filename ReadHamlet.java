package AssignmentHamlet;


    import java.io.File;
import java.io.FileNotFoundException;
    import java.util.LinkedList;
    import java.util.Scanner;


    public class ReadHamlet {
        public static void main(String[] args) {

            try {
                File file = new File("src/AssignmentHamlet/hamlet.txt");


                try (Scanner scanner = new Scanner(file);) {
                    while (scanner.hasNextLine()) {
                        String line = scanner.nextLine();
                        System.out.println(line);


                    }

                }
                String output = reverse("src/AssignmentHamlet/hamlet.txt");
                System.out.println(output);


            }catch(FileNotFoundException e){
                System.out.println("Error. ");
                e.printStackTrace();
            }
        }


        //(2) reverse order

        public static String reverse (String reverse){
            char []  str = new char[reverse.length()];
            int strIndex = 0;
            for(int i = reverse.length()-1; i >= 0; i--){
                str [strIndex] = reverse.charAt(i);
                strIndex++;
            }
            String reversed = "";
            for(int i = 0; i < reversed.length(); i++){
                reverse = reverse + str[i];
            }
            return reverse;
        }
        }



