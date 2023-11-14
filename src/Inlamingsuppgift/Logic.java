package Inlamingsuppgift;
// Programmet skall bestå av två klasser:
// En klass som läser in text och skriver ut
// resultatet till användaren
//En annan klass som räknar raderna och har
//koll på antalet tecken
//Kontrollen för att ha koll på om användaren
//har skrivit ordet stop eller inte får utföras i
//vilken av klasserna man vill

    public class Logic {
        private int totalCharacters; // attribute
        private int totalLines;


        public Logic(int character, int lines) { // constructor
            totalCharacters = character;
            totalLines = lines;
        }

        public void addTotalCharacters(int characters) {
                totalCharacters += characters;
        }

        public void addTotalLines(){
            totalLines++;
        }

        public int getTotalCharacters(){

            return totalCharacters;
        }

        public int getTotalLines() {
            return totalLines;
        }
    }


