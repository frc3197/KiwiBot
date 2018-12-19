package frc.robot.commands.auto.commands;

import edu.wpi.first.wpilibj.command.TimedCommand;
import frc.robot.Robot;
import frc.robot.RobotMap;

public class TimeDrive extends TimedCommand {
  private double initAngle;
  private double speed;

  private boolean useGyro;

  public TimeDrive(double speed, boolean useGyro, double timeout) {
    super(timeout);
    requires(Robot.driveTrain);

    this.speed = speed;
    this.useGyro = useGyro;

    initAngle = Robot.sensors.gyro.getAngle();
  }

  @Override
  protected void execute() {
    double r = (useGyro) ? RobotMap.gyroCorrection(Robot.sensors.gyro, initAngle) : 0;
    Robot.driveTrain.drive(0, speed, r);
  }

  @Override
  protected void end() {
    Robot.driveTrain.drive(0, 0, 0);
  }
}
