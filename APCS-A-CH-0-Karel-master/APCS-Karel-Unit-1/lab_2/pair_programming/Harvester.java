package lab_2.pair_programming;


import kareltherobot.*; 
/**
 * @author :
 * teacher :
 * due date:
 */
public class Harvester extends Robot
{
    //Constructor method that utilizes the constructor method of the super class (UrRobot)
    public Harvester(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);

    }
    
    public void harvest() {
        //Complete this method, using the methods you create below so that all rows are harvested
        move();
        harvest2row();
        harvest2row();
        harvest2row();
        replace();
    }
    
    public void replace() {
        turnRight();
        move();
        turnLeft();
        replace2row();
        replace2row();
        replace2row();
    }
    
    public void replace2row() {
        replacerow();
        turnRight();
        move();
        turnRight();
        replacerow();
        turnLeft();
        move();
        turnLeft();
    }
    
    public void replacerow() {
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        
    }
    
    
    public void harvest2row() {
        harvestrow();
        turnLeft();
        move();
        turnLeft();
        harvestrow();
        turnRight();
        move();
        turnRight();
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void harvestrow() {
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
    }
    //your methods go below
    
    
}

