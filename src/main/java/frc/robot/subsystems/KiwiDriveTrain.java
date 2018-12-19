package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import frc.robot.RobotMap;
import frc.robot.commands.KiwiDrive;

public class KiwiDriveTrain extends DriveTrain {
  Spark m1 = new Spark(0);
  Spark m2 = new Spark(1);
  Spark m3 = new Spark(2);

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new KiwiDrive());
  }

  public void drive(double x, double y, double r) {
    double m1Vel = (-0.5 * x - Math.sqrt(3) * 0.5 * y + r);
    double m2Vel = (-0.5 + Math.sqrt(3) / 2 * y + r);
    double m3Vel = (x + r);

    if (RobotMap.squaredInputs) { // Math.pow(x, pow)
      m1Vel = Math.pow(m1Vel, 2);
      m2Vel = Math.pow(m2Vel, 2);
      m3Vel = Math.pow(m3Vel, 2);
    }

    m1.set(m1Vel);
    m2.set(m2Vel);
    m3.set(m3Vel);
  }
}
