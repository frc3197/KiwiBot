package frc3197.demo.commands;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import frc3197.demo.Robot;

public class TankDrive extends Drive {

  @Override
  protected void execute() {
    double y = Robot.oi.stick.getY(Hand.kRight);
    double r = Robot.oi.stick.getX(Hand.kLeft);
    Robot.driveTrain.drive(0, y, r);
  }
}
