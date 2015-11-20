package org.teachingkidsprogramming.section01forloops;

import org.teachingextensions.logo.ColorWheel;
import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class DoubleLoop
{
  public static void main(String[] args)
  {
    Tortoise.setX(250);
    Tortoise.setY(150);
    Tortoise.setSpeed(10);
    ColorWheel.addColor(PenColors.Blues.Blue);
    ColorWheel.addColor(PenColors.Blues.DodgerBlue);
    ColorWheel.addColor(PenColors.Blues.Aqua);
    for (int i = 0; i < 6; i++)
    {
      Tortoise.setPenColor(ColorWheel.getNextColor());
      Tortoise.move(4 * i);
      Tortoise.turn(-360 / 6);
      for (int j = 0; j < 15; j++)
      {
        Tortoise.setPenWidth(17);
        Tortoise.move(8 * j);
        Tortoise.turn(360 / 5);
      }
      Tortoise.hide();
      Tortoise.getBackgroundWindow().setBackground(PenColors.Grays.Black);
    }
    Tortoise.setX(325);
    Tortoise.setY(210);
    for (int i = 0; i < 5; i++)
    {
      Tortoise.setPenColor(PenColors.Whites.FloralWhite);
      Tortoise.move(25);
      Tortoise.turn(360 / 5);
    }
  }
}
