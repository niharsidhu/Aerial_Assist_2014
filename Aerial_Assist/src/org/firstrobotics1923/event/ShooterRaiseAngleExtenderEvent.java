package org.firstrobotics1923.event;

import org.firstrobotics1923.Components;
/**
 * An event to run the shooter angle system
 * 
 * @author Kartik Vaidya, Nithin Suresh, Prasanth Yedlapalli, Saikiran Nakka, DJ Wadhwa
 * @version 1.0
 * @since Jan 24, 2014
 */
public class ShooterRaiseAngleExtenderEvent extends Event {
    
    public ShooterRaiseAngleExtenderEvent(){
        super(true);
    }
    
    /**
     * Constructor that runs shooterAngleSystem
     */
    public void event() {
    
    Components.shooterAngleSystem.activate();
}
    
}
