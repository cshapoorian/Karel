package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem3 extends Problem2
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem3(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }
    
    public void camgo() {
        H();
        m2r3();
        m2r3();
        m2r3();
        m2r3();
    }
    
    public void isaacgo() {
        H();
        move2();
        pbm4();
        pbm4();
        pbm4();
        O();
    }
    
    public void jonligo() {
        row4();
        m2r3();
        move2();
        pbm4();
        pbm4();
        O();
    }
    
    public void izzygo() {
        
    }
    
    public void jessego() {
        
    }
    
    public void pbm4() {
        putBeeper();
        move4();
    }
    
    public void O() {
        putBeeper();
        move2();
        putBeeper();
    }
    
    public void H() {
        putBeeper();
        move3();
        putBeeper();
    }
    
    public void m2r3() {
        move2();
        row3();
    }
    
    public void move2() {
        move();
        move();
    }
    
    public void move3() {
        move();
        move2();
    }
    
    public void move4() {
        move3();
        move();
    }
    
    public void row3() {
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
    }
    
    public void row4() {
        row3();
        move();
        putBeeper();
    }
}
