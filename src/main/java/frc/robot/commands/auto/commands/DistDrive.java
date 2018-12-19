package frc.robot.commands.auto.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.RobotMap;

public class DistDrive extends Command {
  private double initLeftDist;
  private double initRightDist;

  private double initAngle;

  private double maxSpeed;
  private double dist;

  private boolean useGyro;

  public DistDrive(double maxSpeed, double dist, boolean useGyro) {
    requires(Robot.driveTrain);

    this.maxSpeed = maxSpeed;

    this.dist = dist;

    this.useGyro = useGyro;
    if (useGyro) {
      initAngle = Robot.sensors.gyro.getAngle();
    }
  }

  @Override
  protected void initialize() {
    initLeftDist = Robot.sensors.leftEncoder.getDistance();
    initRightDist = Robot.sensors.rightEncoder.getDistance();
  }

  @Override
  protected void execute() {
    double r = (useGyro) ? RobotMap.gyroCorrection(Robot.sensors.gyro, initAngle) : 0;
    Robot.driveTrain.drive(0, Math.min(maxSpeed, getSpeed()), r);
  }

  @Override
  protected boolean isFinished() {
    return Math.abs(getDistance()) < RobotMap.autoDistThreshold && Math.abs(getSpeed()) < RobotMap.autoSpeedThreshold;
  }

  private double getSpeed() {
    return Math.min(1, getDistance() * RobotMap.autoSpeedChangePerDist);// Robot.sensors.leftEncoder.getRate()
  }

  private double getDistance() {
    double deltaLeftDist = Robot.sensors.leftEncoder.getDistance() - initLeftDist;
    double deltaRightDist = Robot.sensors.rightEncoder.getDistance() - initRightDist;
    return dist - (deltaLeftDist + deltaRightDist) / 2;
  }
}
