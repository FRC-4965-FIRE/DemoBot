
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.DigitalIOButton;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;
import edu.wpi.first.wpilibj.templates.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // Another type of button you can create is a DigitalIOButton, which is
    // a button or switch hooked up to the cypress module. These are useful if
    // you want to build a customized operator interface.
    // Button button = new DigitalIOButton(1);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
    Joystick controller = new Joystick(1);
    Button btnOne = new JoystickButton(controller, 1);
    Button btnTwo = new JoystickButton(controller, 2);
    Button btnThree = new JoystickButton(controller, 3);
    Button btnFour = new JoystickButton(controller, 4);
    Button btnSix = new JoystickButton(controller, 6);
    
    public OI()
    {
        btnSix.whileHeld(new FireCannon());      //Right Shoulder
        btnThree.whileHeld(new RunRelay());      //Blue X Left
        //btnFour.whenPressed(new RaiseCannon());  //Yellow Y Top
        //btnOne.whenPressed(new LowerCannon());   //Green A Bottom
    }
    
    public double LeftStickY()
    {
        if(controller.getY() < .02 && controller.getY() > -.02)
        {
            return 0.0;
        }
        return controller.getY();
    }
    
    public double RightStickY()
    {
        if(controller.getRawAxis(5) < .02 && controller.getRawAxis(5) > -.02)
        {
            return 0.0;
        }
        return controller.getRawAxis(5);        
    }
}

