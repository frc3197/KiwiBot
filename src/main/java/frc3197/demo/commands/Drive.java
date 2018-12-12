package frc3197.demo.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc3197.demo.Robot;

public abstract class Drive extends Command {
  public Drive() {
    requires(Robot.driveTrain);
  }

  @Override
  protected final void initialize() {
    Robot.driveTrain.drive(0, 0, 0);
  }

  @Override
  protected final boolean isFinished() {
    return false;
  }

  @Override
  protected final void end() {
    Robot.driveTrain.drive(0, 0, 0);
  }
}
