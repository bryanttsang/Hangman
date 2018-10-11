import java.util.Scanner;

public class BTsangLib {

    public static void main(String[] args)
    {
        System.out.print("Player 1, type a word. ");
        Scanner wor = new Scanner(System.in);
        String word = wor.nextLine();
        System.out.print("Enter number of allowed wrong guesses. ");
        Scanner guesse = new Scanner(System.in);
        int guesses = guesse.nextInt();
        String blank = "";
        for (int i = 0; i < word.length(); i++)
        {
            blank = blank + "_ ";
        }
        String answer = "";
        for (int i = 0; i < word.length(); i++)
        {
            answer = answer + word.charAt(i) + " ";
        }
        while (!blank.equals(answer) && guesses > 0)
        {
            System.out.print("Player 2, guess a letter. " + blank);
            wor = new Scanner(System.in);
            String letter = wor.nextLine();
            if (answer.contains(letter))
            {
                while (answer.contains(letter))
                {

                }
            }
        }
        System.out.print("Player 2, guess a letter. " + blank + "Answer: " + answer);
    }
}
