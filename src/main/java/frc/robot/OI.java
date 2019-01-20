package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.ToggleSquaredInputs;

public class OI {
  public XboxController stick = new XboxController(1);
  public JoystickButton toggleSquared = new JoystickButton(stick, RobotMap.buttonSquaredInputs);

  public OI() {
    toggleSquared.whenPressed(new ToggleSquaredInputs());
  }
}