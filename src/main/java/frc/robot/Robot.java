package frc.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.KiwiDriveTrain;
import frc.robot.subsystems.TankDriveTrain;

public class Robot extends IterativeRobot {
  public static OI oi;
  public static Sensors sensors;

  public static DriveTrain driveTrain;

  Command m_autonomousCommand;
  SendableChooser<Command> m_chooser = new SendableChooser<>();

  @Override
  public void robotInit() {
    oi = new OI();
    sensors = new Sensors();
    if (RobotMap.currentType == RobotMap.RobotType.TANK) {
      driveTrain = new TankDriveTrain();
    } else {
      driveTrain = new KiwiDriveTrain();
    }
  }

  @Override
  public void robotPeriodic() {
    Scheduler.getInstance().run();
  }

  @Override
  public void disabledInit() {
  }

  @Override
  public void disabledPeriodic() {
    // Scheduler.getInstance().run();
  }

  @Override
  public void autonomousInit() {
    m_autonomousCommand = m_chooser.getSelected();

    if (m_autonomousCommand != null) {
      m_autonomousCommand.start();
    }
  }

  @Override
  public void autonomousPeriodic() {
    // Scheduler.getInstance().run();
  }

  @Override
  public void teleopInit() {
    if (m_autonomousCommand != null) {
      m_autonomousCommand.cancel();
    }
  }

  @Override
  public void teleopPeriodic() {
    // Scheduler.getInstance().run();
  }

  @Override
  public void testPeriodic() {
  }
}
