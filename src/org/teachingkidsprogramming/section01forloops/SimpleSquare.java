package org.teachingkidsprogramming.section01forloops;

import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class SimpleSquare
{
  public static void main(String[] args) throws Exception
  {
    VirtualProctor.setClassName("Palm STEM Academy");
    VirtualProctor.setName("Jazmine & Sabrina");
    Tortoise.show();
    Tortoise.setSpeed(10);
    int sides = 500;
    for (int i = 0; i < sides; i++)
    {
      Tortoise.setPenColor(PenColors.getRandomColor());
      Tortoise.move(i * 2);
      Tortoise.turn(0.2 * 360);
      Tortoise.setPenWidth(5);
      for (int j = 0; j < args.length; j++)
      {
      }
    }
  }
}
