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
            int value = scanner.nextInt();
            scanner.nextLine();
            return value;
        }
        public int getIntInput(
                String prompt,
                int min,
                int max) {
            while (true) {
                int value = getIntInput(prompt);

                if (HelperUtils.isValidNumber(value, min, max)) {
                    return value;
                }
                IO.println(
                        "Please enter a number between "
                                + min + " and " + max + "."
                );
            }
        }
        public double getDoubleInput(String prompt) {
          IO.println(prompt + " ");

            while (!scanner.hasNextDouble()) {
        }
            }
        }
}

