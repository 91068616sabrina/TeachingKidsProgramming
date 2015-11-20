package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.windows.MessageBox;

public class AdLibs
{
  public static void main(String[] args)
  {
    String currrentAdverb = MessageBox.askForTextInput("Enter a name");
    if (currrentAdverb.isEmpty())
    {
      MessageBox.showMessage("Don't you want to do AdLibs?");
      return;
    }
    else if (currrentAdverb.matches("[\\d]*"))
    {
      MessageBox.showMessage("Hello! Numbers are NOT adverbs, try again");
      return;
    }
    String currentEdVerd = MessageBox.askForTextInput("Enter a verb ending in '-ed'");
    String currentBodyPart = MessageBox.askForTextInput("Enter body part");
    String currentStory = "Today, " + currrentAdverb + " " + currentEdVerd + " " + currentBodyPart + ". ";
    // MessageBox.showMessage("I woke " + currentAdverb + ". ");
    //MessageBox.showMessage("Then I " + currentEdVerd + " ");
    //MessageBox.showMessage("my " + currentBodyPart + ". ");
    MessageBox.showMessage(currentStory);
  }
}
