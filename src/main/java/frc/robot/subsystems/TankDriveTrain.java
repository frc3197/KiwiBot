package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import frc.robot.RobotMap;
import frc.robot.commands.TankDrive;

public class TankDriveTrain extends DriveTrain {
  TalonSRX left = new TalonSRX(RobotMap.leftSparkChannel);
  TalonSRX right = new TalonSRX(RobotMap.rightSparkChannel);

  public TankDriveTrain() {
  }

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new TankDrive());
  }

  public void drive(double x, double y, double r) {
    if (Math.abs(y) < RobotMap.deadband) {
      y = 0;
    }
    if (Math.abs(r) < RobotMap.deadband) {
      r = 0;
    }
    left.set(ControlMode.PercentOutput, x + r);
    right.set(ControlMode.PercentOutput, x - r);
  }

}
