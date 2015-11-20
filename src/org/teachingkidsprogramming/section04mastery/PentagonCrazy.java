package org.teachingkidsprogramming.section04mastery;

import org.teachingextensions.logo.ColorWheel;
import org.teachingextensions.logo.PenColors.Blues;
import org.teachingextensions.logo.PenColors.Greens;
import org.teachingextensions.logo.PenColors.Purples;
import org.teachingextensions.logo.Tortoise;

public class PentagonCrazy
{
  public static void main(String[] args)
  {
    Tortoise.setSpeed(10);
    createColorPalette();
    //
    drawPentagon();
  }
  private static void drawPentagon()
  {
    for (int i = 0; i < 200; i++)
    {
      adjustPen();
      Tortoise.move(i);
      Tortoise.turn(360 / 5);
      Tortoise.turn(+1);
    }
  }
  private static void adjustPen()
  {
    //
    Tortoise.setPenColor(ColorWheel.getNextColor());
    Tortoise.setPenWidth(3);
    int i = 1;
    if (i > 4)
    {
      Tortoise.setPenWidth(1);
    }
  }
  private static void createColorPalette()
  {
    ColorWheel.addColor(Blues.SteelBlue);
    ColorWheel.addColor(Purples.DarkOrchid);
    ColorWheel.addColor(Blues.DarkSlateBlue);
    ColorWheel.addColor(Greens.Teal);
    ColorWheel.addColor(Purples.Indigo);
  }
}
