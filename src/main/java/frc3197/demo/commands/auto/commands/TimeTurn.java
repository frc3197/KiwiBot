package frc3197.demo.commands.auto.commands;

import edu.wpi.first.wpilibj.command.TimedCommand;
import frc3197.demo.Robot;

public class TimeTurn extends TimedCommand {
  private double speed;

  public TimeTurn(double speed, double timeout) {
    super(timeout);
    requires(Robot.driveTrain);

    this.speed = speed;
  }

  @Override
  protected void execute() {
    Robot.driveTrain.drive(0, 0, speed);
  }
}
