package org.teachingkidsprogramming.section05recursion;

import java.awt.Color;
import java.util.HashMap;

import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class TurtleTree
{
  @SuppressWarnings("unused")
  public static void main(String[] args)
  {
    Tortoise.getBackgroundWindow().setColor(Color.BLUE);
    Tortoise.setSpeed(10);
    int branch = 60;
    drawBranch(branch);
  }
  private static void drawBranch(int branch)
  {
    if (branch > 0)
    {
      adjustColor(branch);
      Tortoise.move(branch);
      drawLowerBranches(branch);
    }
  }
  private static void adjustColor(int branch)
  {
    HashMap<Integer, Color> colors = new HashMap<Integer, Color>();
    colors.put(10, PenColors.Greens.Lime);
    colors.put(20, PenColors.Blues.Teal);
    colors.put(30, PenColors.Greens.DarkGreen);
    colors.put(40, PenColors.Reds.DarkRed);
    colors.put(50, PenColors.Greens.DarkOliveGreen);
    colors.put(60, PenColors.Grays.Black);
    Tortoise.setPenColor(colors.get(branch));
  }
  private static void drawLowerBranches(int branch)
  {
    Tortoise.turn(30);
    drawShorterBranch(branch);
    Tortoise.turn(-60);
    drawShorterBranch(branch);
    Tortoise.turn(30);
    adjustColor(branch);
    Tortoise.move(-branch);
  }
  private static void drawShorterBranch(int branch)
  {
    drawBranch(branch - 10);
  }
}