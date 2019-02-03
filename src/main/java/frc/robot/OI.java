package frc.robot;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.ToggleSquaredInputs;

public class OI {
  public XboxController stick = new XboxController(1);
  public JoystickButton toggleSquared = new JoystickButton(stick, RobotMap.buttonSquaredInputs);

  public ADXRS450_Gyro gyro = new ADXRS450_Gyro();

  public OI() {
    toggleSquared.whenPressed(new ToggleSquaredInputs());
  }
}