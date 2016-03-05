/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.templates.RobotMap;

/**
 *
 * @author Developer
 */
public class Cannon extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public static Cannon instance;
    Solenoid launch;
    Solenoid up;
    Solenoid down;
    
    public static Cannon getInstance()
    {
        if(instance == null)
        {
            instance = new Cannon();
        }
        
        return instance;
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefault
    }
    
    private Cannon()
    {
        launch = new Solenoid(RobotMap.Launch);
        up = new Solenoid(RobotMap.Up);
        down = new Solenoid(RobotMap.Down);
    }
    
    public void Fire()
    {
        launch.set(true);
    }
    
    public void Stop()
    {
        launch.set(false);
    }
    
    public void RaiseCannon()
    {
        up.set(true);
        down.set(false);
    }
    
    public void LowerCannon()
    {
        down.set(true);
        up.set(false);
    }
}
