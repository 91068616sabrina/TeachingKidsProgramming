package org.teachingkidsprogramming.section03ifs;

import org.teachingextensions.logo.PenColors.Blues;
import org.teachingextensions.logo.Tortoise;

public class ConcentricLoop
{
  public static void main(String[] args)
  {
    Tortoise.setX(150);
    Tortoise.setY(200);
    Tortoise.setSpeed(10);
    for (int i = 0; i < 360; i++)
    {
      Tortoise.move(3);
      Tortoise.turn(1);
      //      If i is divisible by 20 --(HINT: Use mod operator '%') --#7
      if (i % 20 == 0)
      {
      }
      //          Do the following 360 times --#8.1
      for (int j = 0; j < 360; j++)
      {
        Tortoise.move(1);
        Tortoise.turn(1);
        //              Change the width of the line that the tortoise draws to 1/100th of the current line --#9   
        Tortoise.setPenWidth(1 / 100);
        Tortoise.setPenColor(Blues.DodgerBlue);
        //          Repeat --#8.2
      }
      for (int j = 0; j < args.length; j++)
      {
      }
    }
  }
}