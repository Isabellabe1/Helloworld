package Inlamingsuppgift;

import java.util.Scanner;

// Skriv ett program som läser in text ifrån
// kommandoraden rad för rad tills användaren
// skriver ordet stop.
// När användaren är klar skriver programmet ut
// antal tecken och hur många rader som
// användaren har skrivit, exklusive raden med ordet "stopp"

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter text line by line. Type 'stop' to finish.");

        int totalCharacters = 0;
        int totalLines = 0;

        Logic logic = new Logic(totalCharacters,totalLines); //logic object with parameters

        while (true) {
            String line = scan.nextLine();


            if (line.equals("stop")) {
                break;
            }


            logic.addTotalLines();
           logic.addTotalCharacters(line.length());

            System.out.println("Number of characters (excluding 'stop' line): " + logic.getTotalCharacters());
            System.out.println("Number of lines (excluding the line with 'stop'): " + logic.getTotalLines());


        }

    }
}
