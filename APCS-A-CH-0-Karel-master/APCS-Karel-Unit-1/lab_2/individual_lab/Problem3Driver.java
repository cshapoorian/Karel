package lab_2.individual_lab;

/**
   @Author:
      Date:
   Teacher: Appel
       Lab: Problem Set 3
      Misc: Karel plants a garden in a cross-shape
  */
import kareltherobot.*;
import java.awt.Color;
public class Problem3Driver implements Directions
{
    public static void main(String args[])  {
        Problem3 cam = new Problem3(3, 2, East, 100);
        Problem3 isaac = new Problem3(4, 2, East, 100);
        Problem3 jonli = new Problem3(5, 2, East, 100);
        Problem3 izzy = new Problem3(6, 2, East, 100);
        Problem3 jesse = new Problem3 (7, 2, East, 100);
        cam.camgo();
        isaac.isaacgo();
        jonli.jonligo();
        izzy.izzygo();
        jesse.jessego();
        cam.turnOff();
        isaac.turnOff();
        jonli.turnOff();
        izzy.turnOff();
        jesse.turnOff();
    } 

    static {
        World.reset(); 
        World.readWorld("worlds/problem3.kwld"); 
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(10);  
        World.setVisible(true);
    }
}