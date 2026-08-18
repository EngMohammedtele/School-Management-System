package utils;

public class InputHandler {
import java.util.Scanner;
    public class InputHandler {
        private Scanner scanner = new Scanner(System.in);

        public String getStringInput(String prompt) {
            IO.println(prompt + " ");
            return scanner.nextLine();
        }
        public int getIntInput(String prompt) {

          IO.println(prompt + " ");

            while (!scanner.hasNextInt()) {
               IO.println(
                        "Please type a whole number: "
                );
                scanner.next();
            }

        }
}

