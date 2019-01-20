package frc.robot.commands;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class KiwiDrive extends Command {

  @Override
  protected void initialize() {
    requires(Robot.driveTrain);
  }

  @Override
  protected void execute() {
    double r = Robot.oi.stick.getX(Hand.kLeft);
    double x = Robot.oi.stick.getX(Hand.kRight);
    double y = Robot.oi.stick.getY(Hand.kRight);
    Robot.driveTrain.drive(x, y, r);
  }

  @Override
  protected boolean isFinished() {
    return false;
  }

  @Override
  protected void end() {
    Robot.driveTrain.drive(0, 0, 0);
  }

}
