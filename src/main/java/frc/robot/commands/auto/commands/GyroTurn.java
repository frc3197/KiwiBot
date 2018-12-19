package frc.robot.commands.auto.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.RobotMap;

public class GyroTurn extends Command {
 private double angle;

  public GyroTurn(double angle, boolean relative) {
    requires(Robot.driveTrain);
    this.angle = (relative) ? Robot.sensors.gyro.getAngle() + angle : angle;
  }

  @Override
  protected void execute() {
    // TODO: incorporate getRate somehow?
    Robot.driveTrain.drive(0, 0, getRotation());
  }

  @Override
  protected boolean isFinished() {
    return Math.abs(getRotation()) < RobotMap.autoMinRotation;
  }

  private double getRotation() {
    return RobotMap.gyroCorrection(Robot.sensors.gyro, angle);
  }
}
