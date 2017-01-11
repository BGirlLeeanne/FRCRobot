package org.usfirst.frc.team4571.robot.subsystems;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
/**
 *
 */
public class TankDriveSubsystem extends Subsystem {
	private RobotDrive robotdrive;
	
	
	public TankDriveSubsystem(){
		robotdrive = new RobotDrive(RobotMap.leftChannel, RobotMap.rightChannel);
	}
	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	private CANTalon speedController = new CANTalon(RobotMap.leftChannel);
	private CANTalon speedController2 = new CANTalon(RobotMap.rightChannel);



	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		//setDefaultCommand(new MySpecialCommand());



	}
	public void intializeSubSystem (){

		speedController.set(0.0);
		speedController2.set(0.0);

	}

	public void speedControl(Joystick left, Joystick right) {
		robotdrive.tankDrive(left, right);



	}
}

