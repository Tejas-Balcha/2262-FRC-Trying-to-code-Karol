/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */

public class OI {

  XboxController driverController = new XboxController(RobotMap.driverController); 

  public double GetDriverRawAxis (int axis) {
    return driverController.getRawAxis(axis);
  }

  
  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.
  public Joystick driveStick = new Joystick(RobotMap.leftJoystickPort);
  //public Joystick intakeJoystick = new Joystick(RobotMap.rightJoystickPort);
  public Button rightBumper = new JoystickButton(driverController, RobotMap.rightBumper);
  public Button leftBumper = new JoystickButton(driverController, RobotMap.leftBumper);
  public Button startButton = new JoystickButton(driverController, RobotMap.buttonStart);
  public Button backButton = new JoystickButton(driverController, RobotMap.buttonBack);



public int rightBumper() {
	return 0;
}

  }
  //public JoystickButton button = new JoystickButton(stick, RobotMap.joystickButtonPort);
 


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

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());
