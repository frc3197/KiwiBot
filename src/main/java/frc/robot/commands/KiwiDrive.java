package frc.robot.commands;

import frc.robot.Robot;

public class KiwiDrive extends Drive {
  @Override
  protected void execute() {
    double r = Robot.oi.stick.getRawAxis(0);
    double x = Robot.oi.stick.getRawAxis(4);
    double y = Robot.oi.stick.getRawAxis(5);
    Robot.driveTrain.drive(x, y, r);  
  }
}
