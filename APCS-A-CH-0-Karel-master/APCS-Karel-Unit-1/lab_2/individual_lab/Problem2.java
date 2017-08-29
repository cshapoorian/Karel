package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem2 extends Problem1
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem2(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void setField(){
        setPins();
        position5();
        row3();
        position6();
        row2();
        position7();
        putBeeper();
        move();
    }
    
    public void position5() {
        turnLeft();
        move();
        turnLeft();
        move2();
    }
    
    public void position6() {
        turnRight();
        move();
        turnRight();
        move();
    }
    
    public void position7() {
        turnLeft();
        move();
        turnLeft();
        move();
    }
    
}
