package lab_1.pair_programming;
import kareltherobot.*; 


/**
 * @author :  C. Shapoorian
 */
public class BeeperBot extends Robot
{
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void showdemhowitsdun() {
        turnLeft();
        move3();
        turnLeft();
        move2();
        pickBeeper();
        move3();
        BeeperL();
        move3();
        BeeperL();
        move3();
        pickBeeper();
        move2();
    }
    
    public void move2(){
        move();
        move();
    }
    
    public void move3(){
        move2();
        move();
    }
    
    public void BeeperL(){
        pickBeeper();
        turnLeft();
    }
    
    public void combo(){
        BeeperL();
        move3();
    }
    
}

