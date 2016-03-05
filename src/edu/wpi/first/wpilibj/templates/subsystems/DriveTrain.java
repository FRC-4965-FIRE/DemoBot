/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.templates.commands.JoystickDrive;
import edu.wpi.first.wpilibj.smartdashboard.*;
import edu.wpi.first.wpilibj.Relay;

/**
 *
 * @author Developer
 */
public class DriveTrain extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public static DriveTrain instance;
    RobotDrive drive;
    //public boolean comp = false;

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand
        setDefaultCommand(new JoystickDrive());
    }
    
    public static DriveTrain getInstance()
    {
        if(instance == null)
        {
            instance = new DriveTrain();
        }
        
        return instance;
    }
    
    private DriveTrain()
    {
        super("DriveTrain");
        
        Jaguar leftDrive = new Jaguar(RobotMap.LeftDrive);
        
        drive = new RobotDrive(leftDrive, new Jaguar(RobotMap.RightDrive));
        //drive.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);            
        
        SmartDashboard.putNumber("Drivetrain", leftDrive.getSpeed());
    }
    
    public void TankDrive(double LeftSpeed, double RightSpeed)
    {
        drive.tankDrive(LeftSpeed, RightSpeed);
    }
    
    /*
    public void toggleRelay(boolean toggle)
    {
        if(toggle)
        {
            dummy.set(Relay.Value.kOn);
        }
        else
        {
            dummy.set(Relay.Value.kOff);
        }
    }*/
}
