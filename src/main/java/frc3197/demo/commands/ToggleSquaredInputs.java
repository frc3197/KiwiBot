package frc3197.demo.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import frc3197.demo.RobotMap;

public class ToggleSquaredInputs extends InstantCommand {
  @Override
  protected void initialize() {
    RobotMap.squaredInputs = !RobotMap.squaredInputs;
  }

}
