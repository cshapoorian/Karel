package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void rearrangeBeepers() {
        move2();
        turnLeft();
        move2();
        pickBeeper();
        flip();
        move();
        pickBeeper();
        move2();
        pickBeeper();
        move();
        pickBeeper();
        flip();
        move2();
        turnLeft();
        move();
        putBeeper();
        move();
        putBeeper();
        flip();
        move2();
        move();
        putBeeper();
        move();
        putBeeper();
        flip();
        move2();
        turnLeft();
        move2();
        flip();
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void move2() {
        move();
        move();
    }
    
    public void trm() {
        turnRight();
        move();
    }
    
    public void flip() {
        turnLeft();
        turnLeft();
    }
    
}
    