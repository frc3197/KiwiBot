package frc3197.demo.commands;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import frc3197.demo.Robot;

public class KiwiDrive extends Drive {
  @Override
  protected void execute() {
    double r = Robot.oi.stick.getX(Hand.kLeft);
    double x = Robot.oi.stick.getX(Hand.kRight);
    double y = Robot.oi.stick.getX(Hand.kRight);
    Robot.driveTrain.drive(x, y, r);  
  }
}
