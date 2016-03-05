/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;
import edu.wpi.first.wpilibj.smartdashboard.*;

/**
 *
 * @author Developer
 */
public class JoystickDrive extends CommandBase {
    
    public JoystickDrive() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(drivetrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        drivetrain.TankDrive(oi.LeftStickY(), oi.RightStickY());
        SmartDashboard.putBoolean("Joystick Drive", true);
        //SmartDashboard.putNumber("Left Stick Y", oi.LeftStickY());
        //SmartDashboard.putNumber("Right Stick Y", oi.RightStickY());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end(){
        SmartDashboard.putBoolean("Joystick Drive", false);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
