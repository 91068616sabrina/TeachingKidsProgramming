package org.teachingkidsprogramming.section03ifs;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.windows.MessageBox;
import org.teachingkidsprogramming.recipes.quizzes.graders.HiLowQuizGrader;

public class HiLowQuiz extends org.teachingkidsprogramming.recipes.quizzes.graders.HiLowQuiz
{
  public void question1()
  {
    //        if the Y position of the tortoise is 115
    Tortoise.getY();
    int Y = Tortoise.getY();
    if (Y == 115)
    {
      Tortoise.turn(63);
    }
  }
  //
  //         turn the tortoise to the right 63 degrees 
  public void question2()
  {
    //        if the X position of tortoise is less than Y position of tortoise
    //
    Tortoise.getY();
    int Y = Tortoise.getY();
    int X = Tortoise.getX();
    if (X < Y)
    {
      Tortoise.turn(-54);
    }
    else
    {
      Tortoise.turn(22);
    }
    //         turn the tortoise 54 degrees to the left
    //
    //        otherwise turn the tortoise 22 degrees to the right
  }
  public void question3()
  {
    //        display the message "elcomeway omehay!"
    MessageBox.showMessage("elcomeway omehay!");
  }
  public void question4()
  {
    //        if the Y position of tortoise is greater than 50
    Tortoise.getY();
    int Y = Tortoise.getY();
    if (Y > 50)
    {
      Tortoise.turn(-177);
    }
    //
    //         turn the tortoise 177 degrees to the left
  }
  public static void main(String[] args)
  {
    new HiLowQuizGrader().grade(new HiLowQuiz());
  }
}
