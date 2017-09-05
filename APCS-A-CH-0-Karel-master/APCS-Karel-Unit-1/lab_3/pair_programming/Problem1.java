package lab_3.pair_programming;

import kareltherobot.*;
import java.awt.Color;

public class Problem1 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem1(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    int x = 0;
    
    public void checkSurrounded(){
        for (int i = 0; i < 4; i++) {
            if (!frontIsClear()) {
                turnLeft();
                x += 1;
            }
        }        
        if (x == 4) {
            turnOff();
        }
        else {
        while (x > 0) {
            turnRight();
            x -= 1;
        }
        }
    

    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}
