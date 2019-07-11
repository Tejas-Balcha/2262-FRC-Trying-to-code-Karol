/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */

 //Small Wheels
public class LiftSubsystem extends Subsystem {
  public static WPI_TalonSRX frontLiftMotor = new WPI_TalonSRX(RobotMap.frontLiftMotorPort); 
  public static WPI_TalonSRX backLiftMotor = new WPI_TalonSRX(RobotMap.backLiftMotorPort);
  public static DoubleSolenoid frontLiftBrake = new DoubleSolenoid(RobotMap.frontLiftBrake1, RobotMap.frontLiftBrake2);
  public static DoubleSolenoid backLiftBrake = new DoubleSolenoid(RobotMap.backLiftBrake1, RobotMap.backLiftBrake2);
  public static VictorSPX smallWheelMaster = new VictorSPX(RobotMap.smallDriveMaster);
  public static VictorSPX smallWheelSlave = new VictorSPX(RobotMap.smallDriveSlave);
  public static SpeedControllerGroup liftMotors = new SpeedControllerGroup(frontLiftMotor, backLiftMotor);

  
  

  public static void drive(double speed) {
    smallWheelMaster.set(ControlMode.PercentOutput, -speed); // Controls both this motor and the smallWheelSlave
    smallWheelSlave.follow(smallWheelMaster);
    smallWheelSlave.setInverted(true);
}


  
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
