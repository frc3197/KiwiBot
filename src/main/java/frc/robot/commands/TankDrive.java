package frc.robot.commands;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import frc.robot.Robot;

public class TankDrive extends Drive {

  @Override
  protected void execute() {
    double y = Robot.oi.stick.getY(Hand.kRight);
    double r = Robot.oi.stick.getX(Hand.kLeft);
    System.out.println(y);
    Robot.driveTrain.drive(0, y, r);
  }
}
