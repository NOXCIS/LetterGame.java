import java.util.Scanner;

    public class  LetterGame {
        private static Scanner input = new Scanner(System.in);

        public static void playerGuess () {
            int numGuesses = 0;
            int asRan;   //Generates random number between 65 - 90 (ASCII table range for capital letters)
            int session = 0;
            int sessions = 0;
            int bestScore = 0;
            char userInput;
            char[] convertedCharArray; //Converts random number to ASCII charater
            int value;                          // declare a int variable to store user iput as ASCII code
            String playagain;
            boolean play = true;

                  asRan  = (int) (Math.random() * 26) + 65;  //Generates random number between 65 - 90 (ASCII table range for capital letters)
                  convertedCharArray = Character.toChars(asRan); //Converts random number to ASCII charater
                  Scanner scan = new Scanner(System.in); // create Scanner class object

            while (play = true)
{
                 session++;

            do {
              System.out.print("Enter your guess in capital: ");
              userInput = scan.next().charAt(0); // gets user guess Input
              value = userInput;  //Converts userInput charater to coresponding ASCII code
              System.out.println();
              numGuesses++;     // Counter for number of user guesses

            if (value > 90) {
              System.out.println("Error! CAPS ONLY");
              System.out.println();
}
       else if (value < 65) {
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


}     while(value != asRan && numGuesses < 3);

            if (value==asRan) {
              System.out.print("You guessed correctly ");
              System.out.println(convertedCharArray);
              sessions++;
}
          else {
              System.out.print("Sorry, You've used up all of your guesses! The correct answer was ");
              System.out.println(convertedCharArray);
}

      Scanner answer = new Scanner(System.in);
              System.out.println("Would you like another GO? [Y/N]");//This asks the player if they would like to play again
                  playagain = answer.nextLine();
           if (playagain.equalsIgnoreCase("Y")) {//This is what happens if the player opts to play again
                  play = true;
                  numGuesses = 0;
}
      else if (playagain.equalsIgnoreCase("N")) {//This is what happens if the player opts to exit the game
        play = false;
        System.out.println("Thanks for playing, Please come back soon!");
        System.out.println("You had  " + session + " Goes");
        System.out.println("The number of times you guessed correctly: " + sessions + "");
        break;
    }
  }
}

        public static void compGuess () {
            int numGuesses = 0;
            int value;
            int compGuess;
            int session = 0;
            int sessions = 0;
            int bestScore = 0;
            char userInput;
            char[] convertedCharArray;
            String playagain;
            boolean play = true;


        Scanner scan = new Scanner(System.in); // create Scanner class object
                  System.out.print("Enter a capital letter (A to Z) for computer to guess: ");
                  userInput = scan.next().charAt(0); // gets user guess Input
                  value = userInput;  //Converts userInput charater to coresponding ASCII cod

            while (play = true)
{
            session++;
            do {
                compGuess  = (int) (Math.random() * 26) + 65;  //Generates random number between 65 - 90 (ASCII table range for capital letters)
                convertedCharArray = Character.toChars(compGuess); //Converts random number to ASCII charater
                numGuesses++;

                System.out.print("Computer guess is: ");
                System.out.println(convertedCharArray);
                System.out.println();

            if (value > compGuess) {
                System.out.println("after");
                System.out.println();
}
       else if (value < compGuess) {
              System.out.println("before");
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
              System.out.print("Sorry, the guess was wrong. Correct letter ");
              System.out.println(convertedCharArray);
}

              Scanner answer = new Scanner(System.in);
              System.out.println("Would you like another GO? [Y/N]");//This asks the player if they would like to play again
              playagain = answer.nextLine();
            if (playagain.equalsIgnoreCase("Y")) {//This is what happens if the player opts to play again
              play = true;
              numGuesses = 0;
} else if (playagain.equalsIgnoreCase("N")) {//This is what happens if the player opts to exit the game
              play = false;
              System.out.println("Thanks for playing, Please come back soon!");
              System.out.println("You had  " + session + " Goes");
              System.out.println("The number of times you guessed correctly: " + sessions + "");
              break;
            }
          }

}



   public static void main(String[] args) {
     while (true) {
       System.out.println("Would you like the computer or the player to input the magic number? (c/p)");
       String inp = input.next();
       if (inp.equals("c")) {
         playerGuess();
         break;
       } else if (inp.equals("p")) {
         compGuess();
         break;
       } else {
         System.out.println("Incorrect input. Please enter either a \"c\" or a \"p\".");
       }
     }
   }
 }
