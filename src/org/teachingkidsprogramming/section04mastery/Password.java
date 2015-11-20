package org.teachingkidsprogramming.section04mastery;

import org.teachingextensions.windows.MessageBox;

public class Password
{
  public static void main(String[] args)
  {
    // Create a little Messagebox app for a login system that checks
    // for an integer password and limits the number of attempts ot enter it before 
    // it locks you out (like on my phone)
    // what do we need?
    // we need an integer password - variable #1
    int password = 16;
    // for loop - keep track of how many times user attempted log in #2
    for (int i = 0; i < 5; i++)
    {
      // variable to store user's password input #3
      int login = MessageBox.askForNumericalInput("What is the password?");
      //int input = 0;
      // check if password is valid if statement #4
      // what if user enters correct password? give them a message #5
      if (login == password)
      {
        MessageBox.showMessage("Welcome !");
        System.exit(0);
      }
      // indicating successful login 
      //what if user enters wrong password but has more attempts available? #6 
      else
      {
        MessageBox.showMessage("Incorrect login. You have " + (5 - i - 1) + " tries left. ");
      }
    }
    // warn the user and tell them how many are left
    // what if user uses up their allowed attempts? #7
    MessageBox.showMessage("Too many tries. You're locked out.");
  }
}
