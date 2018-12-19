package frc.robot.commands;

import frc.robot.Robot;

public class TankDrive extends Drive {

  @Override
  protected void execute() {
    double y = Robot.oi.stick.getRawAxis(5);
    double r = Robot.oi.stick.getRawAxis(0);

    Robot.driveTrain.drive(0, y, r);

  }
}