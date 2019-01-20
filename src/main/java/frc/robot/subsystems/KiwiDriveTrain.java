package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.KiwiDrive;

public class KiwiDriveTrain extends Subsystem {
  private TalonSRX frontTalon = new TalonSRX(RobotMap.TalonID.FRONT.id);
  private TalonSRX backLeftTalon = new TalonSRX(RobotMap.TalonID.BACKLEFT.id);
  private TalonSRX backRightTalon = new TalonSRX(RobotMap.TalonID.BACKRIGHT.id);

  public boolean squaredInputs = false;

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new KiwiDrive());
  }

  public void drive(double x, double y, double r) {
    double front = (x) + r;
    double backLeft = (-0.5 * x + Math.sqrt(3) * 0.5 * y) + r;
    double backRight = (-0.5 * x - Math.sqrt(3) / 2 * y) + r;

    if (squaredInputs) {
      front = Math.copySign(Math.pow(front, 2), front);
      backLeft = Math.copySign(Math.pow(backLeft, 2), backLeft);
      backRight = Math.copySign(Math.pow(backRight, 2), backRight);
    }

    frontTalon.set(ControlMode.PercentOutput, front);
    backLeftTalon.set(ControlMode.PercentOutput, backLeft);
    backRightTalon.set(ControlMode.PercentOutput, backRight);
  }
}
