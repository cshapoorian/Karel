package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void shuttleRace() {
        turnLeft();
        move();
        RM2();
        RM2();
        toploop();
        RM2();
        turnRight();
        move();
        turnRight();
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
   
    public void RM2() {
        turnLeft();
        turnLeft();
        turnLeft();
        move();
        move();
    }
    
    public void toploop() {
        turnLeft();
        move();
        move();
        turnLeft();
        move();
        move();
        turnLeft();
        move();
        move();
        turnLeft();
        move();
        move();
    }
}