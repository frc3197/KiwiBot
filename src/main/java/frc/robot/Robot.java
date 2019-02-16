package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
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
    SmartDashboard.putNumber("Blue ", Robot.colorSensor.blue());
    SmartDashboard.putNumber("Red ", Robot.colorSensor.red());
    SmartDashboard.putNumber("Green ", Robot.colorSensor.green());
    SmartDashboard.putNumber("Proximity ", Robot.colorSensor.proximity());
    SmartDashboard.putBoolean("isWhite", Robot.colorSensor.isWhite());
  }

  @Override
  public void testPeriodic() {
  }
}
