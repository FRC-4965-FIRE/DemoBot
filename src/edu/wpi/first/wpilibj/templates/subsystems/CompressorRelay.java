/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Relay;

/**
 *
 * @author Developer
 */
public class CompressorRelay extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public static CompressorRelay instance;
    Relay comp;
    //public boolean comp = false;

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand
    }
    
    public static CompressorRelay getInstance()
    {
        if(instance == null)
        {
            instance = new CompressorRelay();
        }
        
        return instance;
    }
    
    private CompressorRelay()
    {
        super("CompresorRelay");
        
        comp = new Relay(2);
    }
    
    public void ActivateRelay()
    {
        comp.set(Relay.Value.kForward);
    }
    
    public void DeactivateRelay()
    {
        comp.set(Relay.Value.kOff);
    }
    
}
