package frc3197.demo.commands.auto.modes;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc3197.demo.commands.auto.commands.*;

public class ForwardAndTurn extends CommandGroup {

  public ForwardAndTurn() {
    addSequential(new TimeDrive(.5, true, 5));
    addSequential(new GyroTurn(90, true));
  }
}
