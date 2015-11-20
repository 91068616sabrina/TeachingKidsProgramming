package org.teachingkidsprogramming.section02methods;

import org.teachingextensions.logo.Tortoise;

public class Houses
{
  public static void main(String[] args)
  {
    Tortoise.setSpeed(10);
    Tortoise.setX(200);
    int height = 40;
    drawFlatHouse(height);
    //   ------------- Recipe for drawHouse --#9.2
    Tortoise.move(height);
    //Tortoise.setPenColor(PenColors.Grays.LightGray);
    //drawHouse(height);
    //Tortoise.turn(-90);
    //drawHouse(90);
    //drawHouse(90);
    //drawHouse(20);
  }
  private static void drawHouse(int height)
  {
    drawFlatHouse(height);
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
  }
  private static void drawFlatHouse(int height)
  {
    drawPointyHouse(height);
  }
  private static void drawPointyHouse(int height)
  {
    Tortoise.move(height);
    Tortoise.turn(90);
    Tortoise.move(30);
    Tortoise.turn(90);
  }
}
