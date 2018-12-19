package frc.robot.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.RobotMap;

public class ToggleSquaredInputs extends InstantCommand {
  @Override
  protected void initialize() {
    RobotMap.squaredInputs = !RobotMap.squaredInputs;
  }

}
