package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem3 extends Robot
{
    public Problem3(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void giveCarlBeeper() {
        //This method should allow karel, who is at (1, 1) to give a beeper to carl (at 1, 4)
        turnRight();
        move();
        move2();
        putBeeper();
        flip();
        move();
        move2();
        turnRight();
    }
    
    public void pickAndMoveBeeper() {
        //This method is for carl to pick up the beeper from karel and move it two blocks north
        turnLeft();
        pickBeeper();
        move2();
        putBeeper();
        flip();
        move2();
        turnLeft();
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void flip() {
        turnLeft();
        turnLeft();
    }
    
    public void move2() {
        move();
        move();
    }
}