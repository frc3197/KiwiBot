package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import frc.robot.subsystems.ColorSensor;
import frc.robot.subsystems.KiwiDriveTrain;

public class Robot extends TimedRobot {
  public static OI oi = new OI();

  public static KiwiDriveTrain driveTrain;
  public static ColorSensor colorSensor;
  // = new KiwiDriveTrain();

  @Override
  public void robotInit() {
    colorSensor = new ColorSensor();
  }

  @Override
  public void robotPeriodic() {
    Scheduler.getInstance().run();
    // System.out.println(oi.gyro.getAngle());
  }

  @Override
  public void disabledInit() {
  }

  @Override
  public void disabledPeriodic() {
    Scheduler.getInstance().run();
  }

  @Override
  public void autonomousInit() {

  }

  @Override
  public void autonomousPeriodic() {
    Scheduler.getInstance().run();
  }

  @Override
  public void teleopInit() {

  }

  @Override
  public void teleopPeriodic() {
    Scheduler.getInstance().run();
    System.out.println("Blue " + Robot.colorSensor.blue());
    System.out.println("Red " + Robot.colorSensor.red());
    System.out.println("Green " + Robot.colorSensor.green());
    System.out.println("Proximity " + Robot.colorSensor.proximity());
  }

  @Override
  public void testPeriodic() {
  }
}
