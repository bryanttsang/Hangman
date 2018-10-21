import java.util.Scanner;

public class BTsangLib {

    public static void main(String[] args)
    {
        System.out.println("Player 1, enter a word.");
        Scanner wor = new Scanner(System.in);
        String word = wor.nextLine();
        System.out.println("Enter number of lives.");
        Scanner guesse = new Scanner(System.in);
        int guesses = guesse.nextInt();
        String blank = " ";
        for (int i = 0; i < word.length(); i++)
        {
            blank = blank + "_ ";
        }
        String answer = " ";
        for (int i = 0; i < word.length(); i++)
        {
            answer = answer + word.charAt(i) + " ";
        }
        String answerr = answer;
        String guessed = "";
        while (!blank.equals(answer) && guesses > 0)
        {
            System.out.println("Player 2, guess a letter." + blank);
            System.out.println("You've guessed:" + guessed);
            wor = new Scanner(System.in);
            String letter = wor.nextLine();
            if (guessed.contains(letter))
            {
                while (guessed.contains(letter))
                {
                    System.out.println("You've already guessed this letter! Guess another letter." + blank);
                    System.out.println("You've guessed:" + guessed);
                    wor = new Scanner(System.in);
                    letter = wor.nextLine();
                }
            }
            if (answerr.contains(letter))
            {
                while (answerr.contains(letter))
                {
                    System.out.println("Correct!");
                    int index = answerr.indexOf(letter);
                    blank = blank.substring(0, index) + answerr.charAt(index) + blank.substring(index + 1);
                    answerr = answerr.substring(0, index) + "_" + answerr.substring(index + 1);
                    guessed = guessed + " " + letter;
                }
            }
            else
            {
                guesses--;
                if (guesses == 0)
                {
                    System.out.println("Incorrect! You lost.");
                }
                if (guesses == 1)
                {
                    System.out.println("Incorrect! You have 1 life left.");
                }
                if (guesses != 0 && guesses != 1)
                {
                    System.out.println("Incorrect! You have " + Integer.toString(guesses) + " lives left.");
                }
                guessed = guessed + " " + letter;
            }
        }
        if (blank.equals(answer) && guesses > 0)
        {
            System.out.println("You won! The word was " + word + ".");
        }
        else
        {
            System.out.println("Player 1 won! The word was " + word + ".");
        }
    }
}
