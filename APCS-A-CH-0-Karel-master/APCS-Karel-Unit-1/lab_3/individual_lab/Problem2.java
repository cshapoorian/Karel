package lab_3.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem2 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem2(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }
    
    public void carpetRooms(){
        carpet();
        carpet();
        carpet();
        carpet();
        carpet();
        carpet();
        carpet();
        carpet();
    }
    
    public void carpet() {
        enterRoom();
        checkBox();
        exitRoom();
    }
    
    public void exitRoom() {
        if(!facingSouth()) {
            turnLeft();
            exitRoom();
        }
        if(facingSouth()) {
            move();
            turnLeft();
        }
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void enterRoom() {
        move();
        turnLeft();
        move();
        turnRight();
    }
    
    public boolean checkRight() {
        if(checkLeft()==true) {
           if(!facingEast()) {
               turnLeft();
               checkLeft();
           }
           if(facingEast()) {
               if(!frontIsClear()) {
                return true;
               }
               else {
                return false;
               }
           }
           return false;
        }
        return false;
    }
    
    public boolean checkTop() {
        if(checkLeft()==true) {
           if(!facingNorth()) {
               turnLeft();
               checkLeft();
           }
           if(facingNorth()) {
               if(!frontIsClear()) {
                return true;
               }
               else {
                return false;
               }
           }
           return false;
        }
        return false;
    }
    
    public boolean checkLeft() {
        if(!facingWest()) {
            turnLeft();
            checkLeft();
        }
        if(facingWest()) {
            if(!frontIsClear()) {
                return true;
            }
            else {
                return false;
            }
        }
        return false;
    }
    
    public void checkBox() {
        if (checkRight()==true) {
            if (checkTop()==true) {
                 if(checkLeft()==true) {
                     putBeeper();
                 }
            }
        }
    }
    
}

