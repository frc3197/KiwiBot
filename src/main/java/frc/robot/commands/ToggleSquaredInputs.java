package frc.robot.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.Robot;

public class ToggleSquaredInputs extends InstantCommand {

  @Override
  protected void initialize() {
    requires(Robot.driveTrain);
    Robot.driveTrain.squaredInputs = !Robot.driveTrain.squaredInputs;
  }

}
