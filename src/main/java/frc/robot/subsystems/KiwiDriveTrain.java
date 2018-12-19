package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import frc.robot.RobotMap;
import frc.robot.commands.KiwiDrive;

public class KiwiDriveTrain extends DriveTrain {
  TalonSRX m1 = new TalonSRX(0);
  TalonSRX m2 = new TalonSRX(1);
  TalonSRX m3 = new TalonSRX(2);

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new KiwiDrive());
  }

  public void drive(double x, double y, double r) {
    double m1Vel = (-0.5 * x - Math.sqrt(3) * 0.5 * y + r);
    double m2Vel = (-0.5 + Math.sqrt(3) / 2 * y + r);
    double m3Vel = (x + r);

    if (RobotMap.squaredInputs) { // Math.pow(x, pow)
      m1Vel = Math.pow(m1Vel, 2);
      m2Vel = Math.pow(m2Vel, 2);
      m3Vel = Math.pow(m3Vel, 2);
    }

    m1.set(ControlMode.PercentOutput, m1Vel);
    m2.set(ControlMode.PercentOutput, m2Vel);
    m3.set(ControlMode.PercentOutput, m3Vel);
  }
}
