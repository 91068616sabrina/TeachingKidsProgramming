package org.teachingkidsprogramming.section03ifs;

import java.util.Random;

import org.teachingextensions.logo.utils.Sounds;
import org.teachingextensions.windows.MessageBox;

public class HiLow
{
  public static void main(String[] args)
  {
    Random randomGenerator = new Random();
    int answer = randomGenerator.nextInt(101);
    //MessageBox.showMessage("Answer is: " + answer);
    int easy = randomGenerator.nextInt(10);
    int medium = randomGenerator.nextInt(101);
    int hard = randomGenerator.nextInt(1000);
    MessageBox.askForNumericalInput("Choose your level: 1, 2, or 3");
    int numberOfGuesses = MessageBox.askForNumericalInput("Enter number of  guesses");
    for (int i = 0; i < numberOfGuesses; i++)
    {
      int guess = MessageBox.askForNumericalInput("Choose a number:");
      if (guess == answer)
      {
        Sounds.playBeep();
        MessageBox.showMessage("You Win!");
        System.exit(0);
      }
      if (guess > answer)
      {
        MessageBox.showMessage("Number too High");
      }
      if (guess < answer)
      {
        MessageBox.showMessage("Number too low");
      }
      if (guess > easy)
        MessageBox.showMessage("Number too High");
      {
        if (guess > medium)
        {
          MessageBox.showMessage("Number too High");
        }
        if (guess > hard)
        {
          MessageBox.showMessage("Number too High");
        }
      }
    }
    MessageBox.showMessage("You Lose.");
  }
}