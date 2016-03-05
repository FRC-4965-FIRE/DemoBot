package edu.wpi.first.wpilibj.templates;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static final int leftMotor = 1;
    // public static final int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static final int rangefinderPort = 1;
    // public static final int rangefinderModule = 1;
    public static final int PWM_ONE = 1; 
    public static final int PWM_TWO = 2; 
    public static final int PWM_THREE = 3; 
    public static final int PWM_FOUR = 4; 
    
    public static final int RELAY_ONE = 1;
    public static final int DUMMY_RELAY =2;
    
    public static final int DIO_ONE = 1;
    
    public static final int SLND_ONE = 1;
    public static final int SLND_TWO = 2;
    public static final int SLND_THREE = 3;
    
    public static final int LeftDrive = PWM_TWO;
    public static final int RightDrive = PWM_ONE;
    
    public static final int CompressorRelay = RELAY_ONE;
    public static final int PressureSwitch = DIO_ONE;
    public static final int Launch = SLND_ONE;
    public static final int Up = SLND_TWO;
    public static final int Down = SLND_THREE;
}
