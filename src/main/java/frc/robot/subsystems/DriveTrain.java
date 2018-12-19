package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public abstract class DriveTrain extends Subsystem {
 
  public abstract void drive(double x, double y, double r);
}
