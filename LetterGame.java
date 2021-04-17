import java.util.Scanner;

    public class  LetterGame {
        boolean exit;
        boolean play = false;
        private  String playagain;
        private  int numGuesses;
        private  int session;           //HOLDS SESSION
        private  int sessions;
        public void runMenu() {

      printHeader();
      while(!exit) {
        printMenu();
        int choice = getInput();
        performAction(choice);
      }
}
        public void printHeader() {

System.out.println("NOX'S LetterGame v1.0");

;



}
        private void printMenu(){
          System.out.println(""
          + ".____     ______________________________________________________          \n"
          + "|    |    \\_   _____/\\__    ___/\\__    ___/\\_   _____/\\______   \\   \n"
          + "|    |     |    __)_   |    |     |    |    |    __)_  |       _/         \n"
          + "|    |___  |        \\  |    |     |    |    |        \\ |    |   \\      \n"
          + "|_______ \\/_______  /  |____|     |____|   /_______  / |____|_  /        \n"
          + "        \\/        \\/                               \\/         \\/      \n"
          + "   ________    _____      _____  ___________                              \n"
          + "  /  _____/   /  _  \\    /     \\ \\_   _____/                           \n"
          + " /   \\  ___  /  /_\\  \\  /  \\ /  \\ |    __)_                          \n"
          + " \\    \\_\\  \\/    |    \\/    Y    \\|        \\                       \n"
          + "  \\______  /\\____|__  /\\____|__  /_______  /                           \n"
          + "         \\/         \\/         \\/        \\/                           \n"
          + "___.            _______   ________  ____  ___                             \n"
          + "\\_ |__ ___.__.  \\      \\  \\_____  \\ \\   \\/  /                      \n"
          + " | __ <   |  |  /   |   \\  /   |   \\ \\     /                           \n"
          + " | \\_\\ \\___  | /    |    \\/    |    \\/     \\                        \n"
          + " |___  / ____| \\____|__  /\\_______  /___/\\  \\                         \n"
          + "     \\/\\/              \\/         \\/      \\_/                        \n"
          + "                                                                          \n"
          + "Welcome to the Game of Letter Guess. You can guess three times            \n"
          + "            Written by Shamar Lee A.K.A NOXCIS                            \n"
          + "                                                                          \n"
          + "                   Who wants to guess?                                    \n"
          + "      ____________     ____________     ____________                      \n"
          + "     |  1 = YOU   |   | 2=COMPUTER |   |  0 = EXIT  |                     \n"
          + "                                                                          \n"
          + "                                                                          ");
        }
        private int getInput() {
          Scanner kb = new Scanner(System.in);
          int choice =-1;
          while (choice < 0 || choice > 2) {
            try {
              System.out.print("\nEnter your choice. ");
              System.out.println();
              choice = Integer.parseInt(kb.nextLine());

            }
            catch(NumberFormatException e) {
              System.out.println("Invalid selection, Try again.");
              System.out.println();
            }
          }
          return choice;
        }
        private void performReplay(int choice){
          switch(choice) {
            case 0:
              play = play;
              runMenu();

            break;
            case 1:
              play = play;

              break;



            default:
            System.out.println("Error Unknown");
          }
        }
        private int rePlayPrmpt() {

                Scanner answer = new Scanner(System.in);
                int choice =-1;
                      while (choice < 0 || choice > 1) {
                        try {

                          choice = Integer.parseInt(answer.nextLine());

                        }
                        catch(NumberFormatException e) {
                          System.out.println("Invalid selection, Try again.");
                        }
                      }
                      return choice;





        }
        private void performAction(int choice){
          switch(choice) {
            case 0:
              play = !play;
              exit = true;
              System.out.println("Goodbye");
            break;
            case 1:
              boolean play = false;
              playerGuess();
            break;
            case 2:
              compGuess();
            break;
            default:
            System.out.println("Error Unknown");
          }
        }
        private void printReplayMenue() {


          System.out.println(""


          + "                                                                          \n"
          + "                                                                          \n"
          + "                                                                          \n"
          + "                      WOULD YOU LIKE TO PLAY AGAIN?                       \n"
          + "                                                                          \n"
          + "                     ____________     _____________                       \n"
          + "                    |   1 = YES  |   |0 = MAIN MENU|                      \n"
          + "                                                                          \n"
          + "                                                                          ");

        }
        private void runReplay() {

                printReplayMenue();
                int choice =rePlayPrmpt();
                performReplay(choice);

        }

        private  Scanner input = new Scanner(System.in);
        public  void playerGuess () {
            //int numGuesses = 0;        //SETS NUMBER OF GUESSES
            int asRan;                 //HOLDS RANDOM ACSII CHARACTER
            int session = 0;           //HOLDS SESSION
            int sessions = 0;          //HOLDS NUMBER OF sessions
            int bestScore = 0;         //HOLDS BEST SCORE
            char userInput;            //DEFINES USER INPUT AS CHAR
            char[] convertedCharArray; //Converts random number to ASCII charater
            int value;                 // declare a int variable to store user iput as ASCII code




                  Scanner scan = new Scanner(System.in); // create Scanner class object

            while (!play) {
              numGuesses = 0;
              asRan  = (int) (Math.random() * 26) + 65;  //Generates random number between 65 - 90 (ASCII table range for capital letters)
              convertedCharArray = Character.toChars(asRan); //Converts random number to ASCII charater
                 session++;

            do {
              System.out.print("Enter your guess in capital: ");
              userInput = scan.next().charAt(0); // gets user guess Input
              value = userInput;  //Converts userInput charater to coresponding ASCII code

              numGuesses++;
                   // Counter for number of user guesses

            if (value > 90 || value < 65) {
              System.out.println("Error! CAPS ONLY");
              System.out.println();
}

       else if (value > asRan) {
              System.out.println("Your guess is after the unknown.");   //This is to help the player get to the answer
              System.out.println();
}
       else if (value < asRan) {
              System.out.println("Your guess is before the unknown.");  //This is to help the player get to the answer
              System.out.println();
}


}     while(value != asRan && numGuesses < 3 );

            if (value==asRan) {
              System.out.print("You guessed correctly ");
              System.out.println(convertedCharArray);
              sessions++;
}
          else {
              System.out.print("Sorry, You've used up all of your guesses! The correct answer was ");
              System.out.println(convertedCharArray);
              System.out.println();
              System.out.println("YOU PLAYED " + session + " GAMES");
              System.out.println();
              System.out.println("The number of times you guessed correctly: " + sessions + "");
              System.out.println();
              System.out.println("Thanks for playing, Please come back soon!");



              }
                  runReplay();
            }

          }
        public  void compGuess () {
            int numGuesses = 0;
            int value;
            int compGuess;
            int session = 0;
            int sessions = 0;
            int bestScore = 0;
            char userInput;
            char[] convertedCharArray;
            String playagain;



        Scanner scan = new Scanner(System.in); // create Scanner class object


            while (!play)
{           numGuesses = 0;
                System.out.print("Enter a capital letter (A to Z) for computer to guess: ");
                  userInput = scan.next().charAt(0); // gets user guess Input
                  value = userInput;  //Converts userInput charater to coresponding ASCII cod
                  session++;
          do {

                if (value > 90 || value < 65) {
                    System.out.println("Error! CAPS ONLY");
                    System.out.println();
                  }

                    compGuess  = (int) (Math.random() * 26) + 65;  //Generates random number between 65 - 90 (ASCII table range for capital letters)
                    convertedCharArray = Character.toChars(compGuess); //Converts random number to ASCII charater
                    numGuesses++;
                    System.out.println();
                    System.out.print("Computer guess is ");
                    System.out.print(convertedCharArray);
                    System.out.println(", OK?");

                if (value > compGuess) {
                    System.out.println("BEFORE");
                    System.out.println();
                  }

       else if (value < compGuess) {
                    System.out.println("AFTER");
                    System.out.println();
             }
           }



        while(value != compGuess && numGuesses < 3);

                if (value==compGuess) {
                    System.out.print("Correct: ");
                    System.out.println(convertedCharArray);
                      sessions++;
                  }

                else {
                    System.out.println("The Computer guessed: 3 times.");
                    System.out.println();
                    System.out.print("Sorry, the guess was wrong. Correct letter ");
                    System.out.println(userInput);
                    System.out.println();
                    System.out.println("THE COMPUTER PLAYED" + session + " GAMES.");
                    System.out.println();
                    System.out.println("Number of Computer Wins: " + sessions + "");
              }
                runReplay();
            }
          }





   public static void main(String[] args) {
     LetterGame lttrgme = new LetterGame();
      lttrgme.runMenu();
      }



   }
